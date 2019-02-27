package com.codeup.springpractice.Repositories;

import com.codeup.springpractice.controllers.Post;
import org.springframework.data.repository.CrudRepository;

public interface Posts extends CrudRepository<Post, Long> {
}
