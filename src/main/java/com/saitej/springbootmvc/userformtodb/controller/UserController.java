package com.saitej.springbootmvc.userformtodb.controller;


import com.saitej.springbootmvc.userformtodb.dto.UserDTO;
import com.saitej.springbootmvc.userformtodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public UserDTO saveUser(UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @GetMapping("/login")
    public String loginAction() {
        return "userform";
    }


    @PostMapping("/handleform")
    public String userForm(@ModelAttribute UserDTO userDTO, Model model) {
        System.out.println("userDto:   "+userDTO);
        UserDTO savedUser = userService.saveUser(userDTO);
        System.out.println("savedUser: " +savedUser);
        model.addAttribute("user",savedUser);
        return "success";

    }


}
