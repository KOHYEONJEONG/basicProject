package com.example.controller;

import com.example.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/users")
    @ResponseBody
    public List<String> getAllUsernames() {
        return loginService.getAllMemberNames();
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}

