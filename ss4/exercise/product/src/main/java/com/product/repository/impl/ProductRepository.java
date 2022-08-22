package com.product.repository.impl;

import com.product.model.Product;
import com.product.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class ProductRepository implements IProductRepository {

    private static final String FIND_BY_ID = "select p from Product p where p.id = :id ";
    private final String FIND_ALL = "select p from Product p where lower(p.productName) like lower(:name)";


    @Override
    public List<Product> findAll(String name) {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(FIND_ALL, Product.class);
        typedQuery.setParameter("name", "%" + name + "%");
        return typedQuery.getResultList();

    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(int id) {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(FIND_BY_ID, Product.class);
        typedQuery.setParameter("id", id);
        return typedQuery.getSingleResult();

    }

    @Override
    public void update(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public List<Product> searchByName(String name) {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(FIND_ALL, Product.class);
        typedQuery.setParameter("name", name);

        return typedQuery.getResultList();
    }

    @Override
    public void remove(int id) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(findById(id));
        entityTransaction.commit();
    }
}
