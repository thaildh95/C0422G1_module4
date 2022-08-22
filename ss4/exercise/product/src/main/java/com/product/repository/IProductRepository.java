package com.product.repository;

import com.product.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll(String name);

    void save(Product product);

    Product findById(int id);

    void update(Product product);

    void remove(int id);

    List<Product> searchByName(String name);

}
