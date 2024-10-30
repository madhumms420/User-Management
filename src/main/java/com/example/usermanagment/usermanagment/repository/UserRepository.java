package com.example.usermanagment.usermanagment.repository;


import com.example.usermanagment.usermanagment.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
