package com.android.mvvm.sample.models;

public class Places {

    private String mPlaceName;
    private String mPlaceImgUrl;

    public Places(String mPlaceName, String mPlaceImgUrl) {
        this.mPlaceName = mPlaceName;
        this.mPlaceImgUrl = mPlaceImgUrl;
    }

    public Places() {
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public void setmPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public String getmPlaceImgUrl() {
        return mPlaceImgUrl;
    }

    public void setmPlaceImgUrl(String mPlaceImgUrl) {
        this.mPlaceImgUrl = mPlaceImgUrl;
    }
}
