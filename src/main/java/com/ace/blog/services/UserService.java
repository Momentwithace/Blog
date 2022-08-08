package com.ace.blog.services;

import com.ace.blog.data.repositories.UserRepository;
import com.ace.blog.dtos.requests.UserRegisterRequest;
import com.ace.blog.dtos.responses.UserRegisterResponse;

public interface UserService {
    UserRegisterResponse register(UserRegisterRequest userRegisterRequest);

}
