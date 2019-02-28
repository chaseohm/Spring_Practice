package com.codeup.springpractice.controllers;

import com.codeup.springpractice.Repositories.Posts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        Iterable<Post> posts = postDao.findAll();
        model.addAttribute("posts", posts);
        return "posts/index";
    }
    @GetMapping("/posts/{id}")
    public String onePost(@PathVariable long id, Model model){
        model.addAttribute("posts",postDao.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showForm(Model model){
        model.addAttribute("post",new Post());
        return "posts/create";
    }
    @PostMapping("/posts/create")
    public String submitPost(@ModelAttribute  Post post, @RequestParam(name = "title") String title, @RequestParam(name = "body") String body){
        postDao.save(post);
        return "redirect:/posts";
    }
    @PostMapping("/posts/delete")
    public String delete(@RequestParam(name = "id") long id){
        Post post = postDao.findOne(id);
        postDao.delete(post);
        return "redirect:/posts";
    }
    @GetMapping("/posts/edit/{id}")
    public String editBlog(@PathVariable Long id, Model model){
        Post post = postDao.findOne(id);
        model.addAttribute("post", post);
        return "posts/edit";
    }
    @PostMapping("/posts/edit/{id}")
    public String edit(@PathVariable Long id, @RequestParam(name = "title") String title, @RequestParam(name = "body") String body, Model model){
       Post post = postDao.findOne(id);
       post.setBody(body);
       post.setTitle(title);
       postDao.save(post);
        return "redirect:/posts/" + id;

    }
    @GetMapping("/posts/contact")
    public String contactPage () {
        return "/posts/contact";
    }

}
