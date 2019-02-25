package com.codeup.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String index(){
        return "index page";
    }
    @GetMapping("/posts/{postid}")
    @ResponseBody
    public String onePost(@PathVariable int postid){
        return "Here is your post " + postid;
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "View the Create Post Form";
    }
    @PostMapping("/posts/create")
    @ResponseBody
    public String submitPost(){
        return "create a new post";
    }

}
