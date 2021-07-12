package com.example.springsecurity.repositories;

import com.example.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    public User getByEmail(String email);
    public List<User> getAllByAuthority(String authority);
}
