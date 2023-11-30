package com.zuber.SecondMiniPro.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/signUp")
    public String signUp(){
        return "signUp";
    }

    @GetMapping("/unlock")
    public String unlock(){
        return "unlock";
    }

    @GetMapping("/forgot")
    public String forgot(){
        return "forgot";
    }

    @GetMapping("/dashboard")
    public String dashBoard(){
        return "dashboard";
    }
}
