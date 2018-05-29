package com.example.dashan.lifesaver;

/**
 * Created by dashan on 29/5/18.
 */

public class Cards {
    public String Title;
    public String Description;
    public int Thumbnail;

    public Cards() {
    }

    public Cards(String title, String description, int thumbnail) {
        Title = title;
        Description = description;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
