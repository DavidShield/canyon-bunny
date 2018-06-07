package com.mygdx.game.util;

/**
 * Created by shield on 5/31/18.
 * Class to define the constants in the project
 */



public class Constants {
    //visiable game world is 5 * 5 meters.
    public static final float VIEWPORT_WIDTH = 5.0f;
    public static final float VIEWPORT_HEIGHT = 5.0f;

    // Location of description file for texture atlas
    public static final String TEXTURE_ATLAS_OBJECTS = "images/canyonbunny.pack";

    // Location of image file for level 01
    public static final String LEVEL_01 = "levels/level-01.png";

    // GUI Width
    public static final float VIEWPORT_GUI_WIDTH = 800.0f;
    // GUI Height
    public static final float VIEWPORT_GUI_HEIGHT = 480.0f;

    // Amount of extra lives at level start
    public static final int LIVES_START = 3;

    // Duration of feather power-up in seconds
    public static final float ITEM_FEATHER_POWERUP_DURATION = 9;

    // Delay after game over
    public static final float TIME_DELAY_GAME_OVER = 3;

}
