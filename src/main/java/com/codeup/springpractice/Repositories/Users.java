package com.codeup.springpractice.Repositories;

import com.codeup.springpractice.controllers.User;
import org.springframework.data.repository.CrudRepository;

public interface Users extends CrudRepository<User, Long> {
}
