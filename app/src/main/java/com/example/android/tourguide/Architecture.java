package com.example.android.tourguide;

public class Architecture {

    public int mImageResourceId = NO_IMAGE_PROVIDED;
    public String mArchitectureName;
    public String mAboutArchitecture;
    public String mArchitectureLocation;
    private static final int NO_IMAGE_PROVIDED = -1;

    Architecture(int imageResourceId, String ArchitectureName, String ArchitectureLocation, String aboutArchitecture) {
        mImageResourceId = imageResourceId;
        mArchitectureName = ArchitectureName;
        mArchitectureLocation = ArchitectureLocation;
        mAboutArchitecture = aboutArchitecture;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getArchitectureName() {
        return mArchitectureName;
    }

    public String getArchitectureLocation() {
        return mArchitectureLocation;
    }

    public String getAboutArchitecture() {
        return mAboutArchitecture;
    }
}
