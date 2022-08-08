package com.ace.blog.services;

import com.ace.blog.data.models.Article;
import com.ace.blog.data.repositories.ArticleRepository;
import com.ace.blog.dtos.requests.ArticleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article save(ArticleRequest articleRequest) {
        return null;
    }
}
