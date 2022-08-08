package com.ace.blog.services;

import com.ace.blog.data.models.Article;
import com.ace.blog.dtos.requests.ArticleRequest;

public interface ArticleService {
    Article save(ArticleRequest articleRequest);
}
