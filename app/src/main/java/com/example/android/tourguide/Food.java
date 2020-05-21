package com.example.android.tourguide;

public class Food {

    public int mImageResourceId = NO_IMAGE_PROVIDED;
    public String mFoodName;
    public String mAboutFood;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Food(int imageResourceId, String foodName, String aboutFood) {
        mImageResourceId = imageResourceId;
        mFoodName = foodName;
        mAboutFood = aboutFood;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getFoodName() {
        return mFoodName;
    }

    public String getAboutFood() {
        return mAboutFood;
    }
}
