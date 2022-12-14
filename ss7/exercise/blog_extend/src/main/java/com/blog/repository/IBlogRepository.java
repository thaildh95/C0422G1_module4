package com.blog.repository;

import com.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog> findByTitleContainingAndDetailContaining(String title, String detail, Pageable pageable);
    Page<Blog> findAllByCatalogy_NameCatalogy(String name ,Pageable pageable);


}
