package com.kevin.graphql.repositories;

import com.kevin.graphql.documents.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {
}
