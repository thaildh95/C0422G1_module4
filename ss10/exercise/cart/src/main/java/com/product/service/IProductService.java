package com.cart.service;

import com.cart.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> findAll();

    Optional<Product> findById(Integer id);

}
