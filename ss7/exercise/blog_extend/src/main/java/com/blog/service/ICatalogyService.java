package com.blog.service;

import com.blog.model.Catalogy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICatalogyService {
    Catalogy save(Catalogy catalogy);

    List<Catalogy> findAll();

    Page<Catalogy> findAllCatalogy(String name, Pageable pageable);
    List<Catalogy> findAll(Pageable pageable);
}
