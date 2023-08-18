package com.example.springsecureex1.repository;

import com.example.springsecureex1.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<CustomUser,Long> {
    @Query("select user from CustomUser user where user.username =: username")
    Optional<CustomUser> findByUsername(String username);
}
