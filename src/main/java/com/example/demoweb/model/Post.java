package com.example.demoweb.model;

import javafx.util.Pair;

import java.util.Date;

public class Post {
    String text;
    Integer likes;
    Date creationDate;
    Long id;

    public Post(Long id, String text, Date creationDate)  {
        this.likes = 0;
        this.id = id;
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

    public Long getId() {
        return id;
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
