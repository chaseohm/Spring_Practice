package com.codeup.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String allPosts(){
        return "posts/index";
    }
    @GetMapping("/posts/{postid}")
    public String onePost(@PathVariable long postid){
        return "posts/show";
    }
    @GetMapping("/posts/create")
    public String showForm(){
        return "posts/create";
    }
    @PostMapping("/posts/create")
    public String submitPost(){
        return "posts";
    }

}
