package com.ace.blog.dtos.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRegisterRequest {

    private String userName;
    private String email;
    private String password;

}
