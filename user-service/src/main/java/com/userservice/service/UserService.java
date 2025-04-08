package com.userservice.service;


import com.userservice.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto); // 회원가입

    UserDto getUserDetailsByEmail(String userName); //로그인
}

