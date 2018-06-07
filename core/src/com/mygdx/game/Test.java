package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.assets.AssetManager;

public class Test extends ApplicationAdapter {
//	SpriteBatch batch;
//	Texture img;

    private OrthographicCamera camera;
    private SpriteBatch batch;
    private Texture texture;
    private Sprite sprite;
    private float rot;

    private WorldController worldController;
    private WorldRenderer worldRenderer;


    private boolean paused;
	@Override
	public void create () {
		//run when app is created

//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");

        // set libgdx log level to debug
        // need to change to log_none or log_info before publishing game
        Gdx.app.setLogLevel(Application.LOG_DEBUG);

        // Load assets
        Assets.instance.init(new AssetManager());

        // initialize controller and renderer
        worldController = new WorldController();
        worldRenderer = new WorldRenderer(worldController);

        // game is active on start
        paused = false;
	}

	@Override
	public void render () {
		//run as app is running

//		Gdx.gl.glClearColor(1, 0, 0, 1);
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		batch.begin();
//		batch.draw(img, 0, 0);
//		batch.end();

        // do not update the app while paused
        if(!paused) {
            worldController.update(Gdx.graphics.getDeltaTime());
        }

        // Sets the clear screen color to: Cornflower Blue
        Gdx.gl.glClearColor(0x64/255.0f, 0x95/255.0f, 0xed/255.0f, 0xff/255.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        worldRenderer.render();
	}

	
	@Override
	public void dispose () {
//		batch.dispose();
//		texture.dispose();

        worldRenderer.render();
        Assets.instance.dispose();
	}

	@Override
    public void resize(int width, int height) {
        worldRenderer.resize(width, height);
    }

    @Override
    public void pause() {
        paused = true;
    }

    @Override
    public void resume() {
        paused = false;
    }
}
