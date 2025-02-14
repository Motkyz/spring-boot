package com.example.demo.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate, Integer likes) {
        this.id = id;
        this.text = text;
        this.likes = likes;
        this.creationDate = creationDate;
    }

    public String getText() {

        return text;
    }

    public Integer getLikes() {

        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
