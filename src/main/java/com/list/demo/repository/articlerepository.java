package com.list.demo.repository;

import com.list.demo.entity.article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface articlerepository extends JpaRepository<article, String> {

}
