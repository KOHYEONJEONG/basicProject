package com.example.login.service;

import com.example.login.repository.LoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginRepository loginRepository;



    public List<String> getAllMemberNames() {
        return loginRepository.getAllMemberNames();
    }
}
