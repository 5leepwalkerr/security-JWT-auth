package com.example.springsecureex1.service.impl;

import com.example.springsecureex1.model.Role;
import com.example.springsecureex1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.FixedKeySet;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("User details layer");

        if (!username.equals("Max")) throw new UsernameNotFoundException("Not Max!");

        Set<Role> roles = new HashSet<>();
        roles.add(new Role("USER"));
        return new User(1L,"Max",passwordEncoder.encode("password"),roles);
    }
}
