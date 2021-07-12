package com.example.springsecurity.services;

import com.example.springsecurity.entities.User;
import com.example.springsecurity.repositories.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{
    @Autowired
    private UserDao userDao;

    public User getUserByEmail(String email)
    {
        return userDao.getByEmail(email);
    }

    public void saveUser(User user)
    {
        userDao.save(user);
    }

    public List<User> getAllByAuthority(String authority) {
        return userDao.getAllByAuthority(authority);
    }
}

