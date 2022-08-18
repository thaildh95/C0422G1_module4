package com.product.repository.impl;

import com.product.model.Product;
import com.product.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository {
    private static Map<String, Product> productMap = new HashMap<>();

    static {

        productMap.put("1", new Product("1", "SamSung s6", "600000", "New", "Sam Sung"));
        productMap.put("2", new Product("2", "Ip 7", "700000", "New", "Apple"));
        productMap.put("3", new Product("3", "SamSung s10", "900000", "New", "Sam Sung"));
        productMap.put("4", new Product("4", "SamSung s6", "600000", "New", "Sam Sung"));
        productMap.put("5", new Product("5", "SamSung s6", "600000", "New", "Sam Sung"));

    }

    @Override
    public List<Product> findAll() {

        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        product.setId(String.valueOf((int) (Math.random() * 1000)));
        productMap.put(product.getId(), product);
    }

    @Override
    public Product findById(String id) {
        return productMap.get(id);

    }

    @Override
    public void update(String id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = new ArrayList<>();
        for (Product p : productMap.values()) {
            if (p.getProductName().toLowerCase().contains(name.toLowerCase())) {
                products.add(p);
            }
        }
        return products;
    }

    @Override
    public void remove(String id) {
        productMap.remove(id);
    }
}
