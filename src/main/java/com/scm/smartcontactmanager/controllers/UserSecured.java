package com.scm.smartcontactmanager.controllers;

import com.scm.smartcontactmanager.entities.User;
import com.scm.smartcontactmanager.helpers.Helper;
import com.scm.smartcontactmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserSecured {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void addLoggedInUserInformation(Model model, Principal principal){

        String email = Helper.getEmailLoggedInUser(principal);
        User user = userService.getUserByEmail(email);
        model.addAttribute("loggedInUser",user);
    }

    @GetMapping("/profile")
    public String profile(){
        return "user/profile";
    }

    @GetMapping("/dashboard")
    public String dashboard(Principal principal , Model model){
        String username = Helper.getEmailLoggedInUser(principal);

        return "user/dashboard";
    }
}
