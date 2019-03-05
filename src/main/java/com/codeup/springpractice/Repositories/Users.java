package com.codeup.springpractice.Repositories;

import com.codeup.springpractice.models.User;
import org.springframework.data.repository.CrudRepository;

public interface Users extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
