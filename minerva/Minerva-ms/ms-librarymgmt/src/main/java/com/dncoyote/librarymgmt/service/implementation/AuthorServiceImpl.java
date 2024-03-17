package com.dncoyote.librarymgmt.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dncoyote.librarymgmt.dto.AuthorRequestDto;
import com.dncoyote.librarymgmt.entity.Author;
import com.dncoyote.librarymgmt.mapper.AuthorMapper;
import com.dncoyote.librarymgmt.repository.AuthorRepository;
import com.dncoyote.librarymgmt.repository.BookRepository;
import com.dncoyote.librarymgmt.service.AuthorService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    public Author createAuthor(AuthorRequestDto authorDto) {

        // Long bookId = authorDto.getBooks().ge;
        // if(null!=bookId)
        // Book book = bookRepository.findById(bookId)
        // .orElseThrow(() -> new IllegalArgumentException("Invalid book ID: " +
        // authorId));

        // authorDto.setBook(book); // Set the fetched book in the author entity
        return authorRepository.save(AuthorMapper.mapToAuthor(authorDto));
    }
}
