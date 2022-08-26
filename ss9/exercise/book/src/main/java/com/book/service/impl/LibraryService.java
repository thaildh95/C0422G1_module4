package com.book.service.impl;

import com.book.model.Library;
import com.book.repository.ILibraryRepository;
import com.book.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService implements ILibraryService {
    @Autowired
    private ILibraryRepository repository;

    @Override
    public Library save(Library library) {
        return repository.save(library);
    }

    @Override
    public Library findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Library> findAll() {
        return repository.findAll();
    }
}
