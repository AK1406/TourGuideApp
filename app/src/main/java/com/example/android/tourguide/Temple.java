package com.example.android.tourguide;

import android.renderscript.ScriptIntrinsic;

public class Temple {
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mTempleName;
    private String mAboutTemple;
    private String mTempleLocation;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Temple(int imageResourceId, String templeName, String templeLocation, String aboutTemple) {
        mImageResourceId = imageResourceId;
        mTempleName = templeName;
        mTempleLocation = templeLocation;
        mAboutTemple = aboutTemple;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getTempleName() {
        return mTempleName;
    }

    public String getAboutTemple() {
        return mAboutTemple;
    }

    public String getTempleLocation() {
        return mTempleLocation;
    }
}
