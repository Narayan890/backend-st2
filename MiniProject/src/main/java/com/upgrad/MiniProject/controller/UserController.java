package com.upgrad.MiniProject.controller;

import com.upgrad.MiniProject.model.User;
import com.upgrad.MiniProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.net.BindException;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/users/login")
    public String login(Model model){
        model.addAttribute("user", new User());
        return "index";
    }


    @RequestMapping(method = RequestMethod.POST , value = "/users/login")
    public String userRegistration(User user){
        userService.registerUser(user);
        return "redirect:index";
    }

}
