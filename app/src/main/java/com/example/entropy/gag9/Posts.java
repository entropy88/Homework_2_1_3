package com.example.entropy.gag9;

/**
 * Created by entropy on 3/3/2018.
 */

public class Posts extends AllTheStuff {
    private String title;
    private String imageUrl;

    public Posts(String title, String imageUrl) {
        this.title = title;
        this.imageUrl = imageUrl;

    }

    public String getTitle(){
        return title;
    }
    public String getImageUrl(){
        return imageUrl;
    }

}
