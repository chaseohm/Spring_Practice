package com.codeup.springpractice.controllers;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 512)
    private String body;

    @Column(nullable = false, length = 128)
    private String title;



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
    public Post() {

    }


}
