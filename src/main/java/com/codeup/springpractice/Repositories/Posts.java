package com.codeup.springpractice.Repositories;

import com.codeup.springpractice.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface Posts extends CrudRepository<Post, Long> {
}
