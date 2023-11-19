package com.example.commerce.controller;

import com.example.commerce.model.User;
import com.example.commerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:5173")
@RestController
public class UserController {
    //injection of user repository
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
