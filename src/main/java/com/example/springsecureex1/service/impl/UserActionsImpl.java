package com.example.springsecureex1.service.impl;

import com.example.springsecureex1.model.CustomUser;
import com.example.springsecureex1.repository.UserRepository;
import com.example.springsecureex1.service.UserActions;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserActionsImpl implements UserActions {
    private static final Logger logger = LoggerFactory.getLogger(UserActions.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(String username, String password) {

    }
}
