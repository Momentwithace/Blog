package com.ace.blog.services;

import com.ace.blog.data.models.User;
import com.ace.blog.data.repositories.UserRepository;
import com.ace.blog.dtos.requests.UserRegisterRequest;
import com.ace.blog.dtos.responses.UserRegisterResponse;
import com.ace.blog.exceptions.UserAlreadyExistException;
import com.ace.blog.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserRegisterResponse register(UserRegisterRequest userRegisterRequest) {
        User user = userRepository.findUserByEmail(userRegisterRequest.getEmail());
        if(user != null){
            throw new UserAlreadyExistException("Your Already Exist!");
        }
        User newUser = new User();
        Mapper.map(newUser, userRegisterRequest);
        userRepository.save(newUser);
        UserRegisterResponse registerResponse = new UserRegisterResponse();
        registerResponse.setMessage("User Successfully Registered!");
        return registerResponse;
    }
}
