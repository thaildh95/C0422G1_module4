package com.product.repository;

import com.product.model.Product;

import java.util.List;

public interface IProductRepository{

    List<Product> findAll();

    void save(Product product);

    Product findById(String id);

    void update(String id, Product customer);

    void remove(String id);
}
