package com.ace.blog.data.repositories;

import com.ace.blog.data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
