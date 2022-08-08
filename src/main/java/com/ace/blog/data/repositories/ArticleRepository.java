package com.ace.blog.data.repositories;

import com.ace.blog.data.models.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {
}
