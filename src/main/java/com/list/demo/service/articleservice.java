package com.list.demo.service;

import com.list.demo.entity.article;
import com.list.demo.repository.articlerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class articleservice {

    @Autowired
    private articlerepository articlerepository;
    public Collection<article> getArticles() {
        return articlerepository.findAll();
    }

}
