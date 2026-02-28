package com.scm.smartcontactmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserSecured {

    @GetMapping("/profile")
    public String returnSecured(){
        return "user/profile";
    }
}
