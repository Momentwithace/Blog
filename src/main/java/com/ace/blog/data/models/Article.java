package com.ace.blog.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document("articles")
@Data
@NoArgsConstructor
public class Article {
    @Id
    private String id;

    @DBRef
    private List<Comment> comments = new ArrayList<>();
}
