package com.example.springsecureex1.service;

import com.example.springsecureex1.model.CustomUser;


public interface UserService {
    CustomUser registerUser(String username, String password);
}
