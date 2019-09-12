package com.example.demoweb.model;

import javafx.util.Pair;

import java.util.Date;

public class Post {
    String text;
    Integer likes;
    Date creationDate;

    public Post(String text, Date creationDate)  {
        this.text = text;
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
