package com.example.login.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class LoginRepository {

    private final JdbcTemplate jdbcTemplate;

    public List<String> getAllMemberNames() {
        return jdbcTemplate.queryForList("SELECT name FROM MEMBER5", String.class);
    }
}
