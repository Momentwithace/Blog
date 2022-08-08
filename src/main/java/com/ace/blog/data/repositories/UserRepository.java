package com.ace.blog.data.repositories;


import com.ace.blog.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findUserByEmail(String email);
}
