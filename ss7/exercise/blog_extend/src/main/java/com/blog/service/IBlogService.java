package com.blog.service;

import com.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog save(Blog blog);

    Blog findById(int id);

    void delete(int id);

    Page<Blog> findAllByDetailAndTitle(String keyword,String title,Pageable pageable);
    Page<Blog> findAllPage(Pageable pageable);
    Page<Blog> findAllCatalogy(String name ,Pageable pageable);



}
