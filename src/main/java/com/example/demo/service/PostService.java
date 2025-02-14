package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<Post>(){
        {
            add(new Post("first", new Date(), 5));
            add(new Post("second", new Date(), 7));
            add(new Post("third", new Date(), 8));
        }
    };

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(text, new Date(),0));
    }
}
