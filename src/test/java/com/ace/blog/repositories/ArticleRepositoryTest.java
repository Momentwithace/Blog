package com.ace.blog.repositories;

import com.ace.blog.data.repositories.ArticleRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArticleRepositoryTest {
    @Autowired
    private ArticleRepository articleRepository;

    @BeforeEach
    void setUp() {
    }
}