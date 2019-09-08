package com.example.demoweb.model;

public class Post {
    String text;
    Integer likes;

    public Post(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getlikes() {
        return likes;
    }

    public void setlikes(Integer likes) {
        this.likes = likes;
    }
}
