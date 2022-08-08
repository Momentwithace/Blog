package com.ace.blog.utils;

import com.ace.blog.data.models.User;
import com.ace.blog.dtos.requests.UserRegisterRequest;

public class Mapper {
    public static void map(User newUser, UserRegisterRequest userRegisterRequest) {
        newUser.setUserName(userRegisterRequest.getUserName());
        newUser.setEmail(userRegisterRequest.getEmail());
        newUser.setPassword(userRegisterRequest.getPassword());
    }
}
