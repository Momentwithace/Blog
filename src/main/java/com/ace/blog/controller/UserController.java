package com.ace.blog.controller;

import com.ace.blog.dtos.requests.UserRegisterRequest;
import com.ace.blog.dtos.responses.UserRegisterResponse;
import com.ace.blog.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    UserRegisterResponse register(@RequestBody UserRegisterRequest userRegisterRequest){
        return userService.register(userRegisterRequest);
    }
}
