package com.product.service;

import com.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {

    Product save(Product product);
    void delete(int id);
    Product findById(int id);
    List<Product> findAll();
    Page<Product> findAllProduct(String ProductName, Pageable pageable);

}
