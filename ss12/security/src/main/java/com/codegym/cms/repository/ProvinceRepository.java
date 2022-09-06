package com.codegym.csm.repository;

import com.codegym.cms.entity.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.security.Provider;

@Repository
public interface ProvinceRepository extends CrudRepository<Provider,Long> {
}
