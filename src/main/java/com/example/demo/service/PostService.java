package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post("first", 5));
        posts.add(new Post("second", 7));
        posts.add(new Post("third", 8));
        return posts;
    }
}
