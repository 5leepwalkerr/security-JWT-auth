package com.example.springsecureex1.service.impl;

import com.example.springsecureex1.model.CustomUser;
import com.example.springsecureex1.repository.UserRepository;
import com.example.springsecureex1.service.UserActions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserActionsImpl implements UserActions {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void createUser(CustomUser user) {
        userRepository.save(user);
        log.info("New user been saved: {}",user.getUserId());
    }
}
