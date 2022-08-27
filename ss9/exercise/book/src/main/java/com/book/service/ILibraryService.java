package com.book.service;

import com.book.model.Library;

import java.util.List;

public interface ILibraryService {
    List<Library> findAll();
    Library findById(int id);
    Library save(Library library);
    void delete(int id);
}
