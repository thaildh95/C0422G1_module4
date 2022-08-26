package com.book.repository;

import com.book.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ILibraryRepository extends JpaRepository<Library,Integer> {

}
