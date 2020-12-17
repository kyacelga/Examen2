package com.kevin.graphql.graphql;

import com.kevin.graphql.documents.Article;
import com.kevin.graphql.repositories.ArticleRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class ArticleQuery implements GraphQLQueryResolver {

    private ArticleRepository articleRepository;

    @Autowired
    public ArticleQuery(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public List<Article> articles() {
        return this.articleRepository.findAll();
    }

    public Article article(String id) {
        Optional<Article> articleDb = this.articleRepository.findById(id);
        return articleDb.get();
    }
}
