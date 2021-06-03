package com.ridoy.unsplashphotos.Models;

public class ImageModel {
    private URLModels urls;

    public ImageModel(URLModels urls) {
        this.urls = urls;
    }

    public URLModels getUrls() {
        return urls;
    }

    public void setUrls(URLModels urls) {
        this.urls = urls;
    }
}
