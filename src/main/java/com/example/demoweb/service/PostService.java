package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import javafx.util.Pair;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import  java.sql.Date;
import java.util.List;

@Service
public class PostService {
    List posts = new ArrayList<Post>();

    public PostService() {
        this.posts.add(new Post((long) 0,"primus", new Date(2000, 10,1)));
    }

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, Date.valueOf(LocalDate.now())));
    }
}
