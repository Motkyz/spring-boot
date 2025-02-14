package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<Post>();
        posts.add(new Post("first", new Date(),5));
        posts.add(new Post("second", new Date(), 7));
        posts.add(new Post("third", new Date(), 8));
        return posts;
    }
}
