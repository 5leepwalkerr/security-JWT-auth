package com.example.springsecureex1.controller;

import com.example.springsecureex1.model.CustomUser;
import com.example.springsecureex1.service.UserActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    @Autowired
    private UserActions userActions;

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @PostMapping("/create-user")
    public ResponseEntity<?> create(@RequestBody CustomUser user){
        userActions.createUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
