package com.codeup.springpractice.controllers;

import com.codeup.springpractice.Repositories.Posts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PostController {

    private final Posts postDao;

    public PostController(Posts postDao) {
        this.postDao = postDao;
    }


    @GetMapping("/posts")
    public String allPosts(Model model){
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }
    @GetMapping("/posts/{id}")
    public String onePost(@PathVariable long id, Model model){
        model.addAttribute("posts",postDao.findOne(id));
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
