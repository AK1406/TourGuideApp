package com.example.android.tourguide;

public class Restaurant {

    public int mImageResourceId = NO_IMAGE_PROVIDED;
    public String mRestaurantName;
    public String mRestaurantLocation;
    public String mAboutRestaurant;
    public String mRestaurantTime;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Restaurant(int imageResourceId, String restaurantName, String restaurantLocation, String restaurantTime, String aboutRestaurant) {
        mImageResourceId = imageResourceId;
        mRestaurantName = restaurantName;
        mRestaurantLocation = restaurantLocation;
        mRestaurantTime = restaurantTime;
        mAboutRestaurant = aboutRestaurant;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getRestaurantName() {
        return mRestaurantName;
    }

    public String getRestaurantLocation() {
        return mRestaurantLocation;
    }

    public String getAboutRestaurant() {
        return mAboutRestaurant;
    }

    public String getRestaurantTime() {
        return mRestaurantTime;
    }
}
