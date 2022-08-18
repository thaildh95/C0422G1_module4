package com.product.service;

import com.product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(String id);

    void update(String id, Product customer);

    void remove(String id);

}
