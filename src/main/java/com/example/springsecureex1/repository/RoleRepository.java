package com.example.springsecureex1.repository;

import com.example.springsecureex1.model.CustomRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<CustomRole,Long> {
    Optional<CustomRole> findByAuthority(String authority);
}
