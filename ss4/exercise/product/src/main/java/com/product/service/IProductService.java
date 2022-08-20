package com.product.service;

import com.product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll(String name);

    void save(Product product);

    Product findById(String id);

    void update(Product product);

    void remove(String id);

    List<Product> searchByName(String name);
}
