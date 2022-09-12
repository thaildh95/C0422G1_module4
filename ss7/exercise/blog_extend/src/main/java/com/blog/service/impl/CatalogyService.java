package com.blog.service.impl;

import com.blog.model.Catalogy;
import com.blog.repository.ICatalogyRepository;
import com.blog.service.ICatalogyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogyService implements ICatalogyService {
    @Autowired
    private ICatalogyRepository repository;

    @Override
    public List<Catalogy> findAll() {
        return repository.findAll();
    }

    @Override
    public Catalogy findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public Page<Catalogy> findAllCatalogy(String name, Pageable pageable) {
        return repository.findAllByNameCatalogy(name,pageable);
    }

    @Override
    public List<Catalogy> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Catalogy save(Catalogy catalogy) {
        return repository.save(catalogy);
    }
}
