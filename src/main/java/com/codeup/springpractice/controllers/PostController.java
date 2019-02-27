package com.codeup.springpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PostController {

    @GetMapping("/posts")
    public String allPosts(Model model){
        List<Post> postings = new ArrayList<>();
        postings.add(new Post("La ti da", "Sing", 2L));
        postings.add(new Post("Cheezits", "Lunch", 3L));
        model.addAttribute("postings", postings);
        return "posts/index";
    }
    @GetMapping("/posts/{id}")
    public String onePost(@PathVariable long id, Model model){
        Post post = new Post("Had a great day in class today", "A-Okay Day",1L);
        model.addAttribute("post",post);
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
