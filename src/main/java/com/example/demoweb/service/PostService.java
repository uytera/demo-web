package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import javafx.util.Pair;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List posts = new ArrayList<Post>();

    public List<Post> listAllPosts(){
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, java.sql.Date.valueOf(LocalDate.now())));
    }
}
