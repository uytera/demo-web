package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import javafx.util.Pair;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts(){
        List posts = new ArrayList<Post>();
        posts.add(new Post("first", new Date(1999, 4, 10)));
        posts.add(new Post("zweit", new Date(2000, 2, 14)));
        posts.add(new Post("tertius", new Date(1989, 3, 25)));
        return posts;
    }
}
