package com.upgrad.MiniProject.service;


import com.upgrad.MiniProject.model.User;
import com.upgrad.MiniProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // containing all bussiness logic and communicate to database


    public void registerUser(User newUser){
        userRepository.registerUser(newUser);
    }
}

