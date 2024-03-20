package com.example.demo.jwt.service;

import com.example.demo.dto.LoginRequest;

public interface AuthService {
    String login(LoginRequest loginDto);
}