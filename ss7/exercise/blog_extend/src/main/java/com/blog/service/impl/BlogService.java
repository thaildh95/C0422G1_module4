package com.blog.service.impl;

import com.blog.model.Blog;
import com.blog.repository.IBlogRepository;
import com.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository repository;



    @Override
    public List<Blog> findAll() {
        return repository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return repository.findById(id).orElse(new Blog());
    }

    @Override
    public Blog save(Blog blog) {
        return repository.save(blog);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public Page<Blog> findAllByDetailAndTitle(String keyword, String title, Pageable pageable) {
        return repository.findByTitleContainingAndDetailContaining(keyword,title,pageable);
    }

    @Override
    public Page<Blog> findAllCatalogy(String name, Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllPage(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
