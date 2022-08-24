package com.blog.repository;

import com.blog.model.Catalogy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICatalogyRepository extends JpaRepository<Catalogy,Integer> {
    Page<Catalogy> findAllByNameCatalogy(String name , Pageable pageable);
}
