package com.example.login;

import com.example.login.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/users")
    public List<String> getAllUsernames() {
        return memberService.getAllMemberNames();
    }
}

