package com.example.springsecurity.controllers;

import com.example.springsecurity.entities.User;
import com.example.springsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private UserService userService;

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }


    @GetMapping("/allUsers")
    public List<User> allUsers()
    {
        return (List<User>) userService.getAllByAuthority("ROLE_USER");
    }

    @GetMapping("/allAdmins")
    public List<User> allAdmins()
    {
        return (List<User>) userService.getAllByAuthority("ROLE_ADMIN");
    }

    @PostMapping("/register")
    public String register(@RequestBody User user)
    {
        userService.saveUser(user);
        return "Registered successfully";
    }

}
