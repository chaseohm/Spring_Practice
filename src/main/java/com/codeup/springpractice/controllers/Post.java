package com.codeup.springpractice.controllers;

public class Post {
    private String body;
    private String title;
    private Long id;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post(String body, String title, Long id) {
        this.body = body;
        this.title = title;
        this.id = id;
    }


}
