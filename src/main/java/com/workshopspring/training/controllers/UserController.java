package com.workshopspring.training.controllers;

import com.workshopspring.training.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria","maria@gmail.com", "123456789", "123456789");
        return ResponseEntity.ok().body(u);
    }
}
