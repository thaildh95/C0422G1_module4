package com.form.service.impl;

import com.form.model.Form;
import com.form.repository.IFormRepository;
import com.form.service.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FormService implements IFormService {
    @Autowired
    private IFormRepository repository;

    @Override
    public Page<Form> findAllByFirstName(String name, Pageable pageable) {
        return repository.findAllByFirstNameContaining(name, pageable);
    }

    @Override
    public Form save(Form form) {
        return repository.save(form);
    }
}
