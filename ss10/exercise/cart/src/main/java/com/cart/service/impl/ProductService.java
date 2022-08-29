package com.cart.service.impl;

import com.cart.model.Product;
import com.cart.repository.IProductRepository;
import com.cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository repository;

    @Override
    public Iterable<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return Optional.empty();
    }
}
