package com.dncoyote.librarymgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dncoyote.librarymgmt.entity.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
