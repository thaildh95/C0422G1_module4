package com.blog.service.impl;

import com.blog.model.Blog;
import com.blog.repository.IBlogRepository;
import com.blog.service.IBlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    private IBlogRepository repository;


    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }
}
