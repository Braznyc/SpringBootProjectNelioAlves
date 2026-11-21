package com.ricardo.SpringBootProjectNelioAlves.controllers;


import com.ricardo.SpringBootProjectNelioAlves.entities.User;
import com.ricardo.SpringBootProjectNelioAlves.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() { //This will return all users
        List<User> result = repository.findAll();
        return result;

    }

    @GetMapping(value = "/{id}") // This will find user by id
    public User findById(@PathVariable Long id) {
        User result = repository.findById(id).get();
        return result;
    }


    @PostMapping // This will find user by id
    public User Insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }
}
