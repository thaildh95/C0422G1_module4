package com.form.service;

import com.form.model.Form;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFormService {
    Form save(Form form);

    Page<Form> findAllByFirstName(String name, Pageable pageable);
}
