package com.codeup.springpractice.models;

import com.codeup.springpractice.models.User;

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

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


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

    public Post(String body, String title, Long id, User user) {
        this.body = body;
        this.title = title;
        this.id = id;
        this.user = user;
    }
    public Post() {

    }
    public Post(String body, String title){
        this.title = title;
        this.body = body;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
