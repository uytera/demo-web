package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(String text1, String text2, String text3){
        List posts = new ArrayList<Post>();
        posts.add(new Post(text1));
        posts.add(new Post(text2));
        posts.add(new Post(text3));
        return posts;
    }
}
