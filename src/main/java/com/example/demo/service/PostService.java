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
            add(new Post(0l,"first", new Date(), 5));
            add(new Post(1l,"second", new Date(), 7));
            add(new Post(2l,"third", new Date(), 8));
        }
    };

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(), text, new Date(),0));
    }
}
