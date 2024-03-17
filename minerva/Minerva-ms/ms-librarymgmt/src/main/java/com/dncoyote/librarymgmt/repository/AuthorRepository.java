package com.dncoyote.librarymgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dncoyote.librarymgmt.entity.Author;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
