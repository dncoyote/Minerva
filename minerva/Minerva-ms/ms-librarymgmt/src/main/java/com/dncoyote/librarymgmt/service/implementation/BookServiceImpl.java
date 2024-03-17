package com.dncoyote.librarymgmt.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dncoyote.librarymgmt.dto.BookRequestDto;
import com.dncoyote.librarymgmt.entity.Author;
import com.dncoyote.librarymgmt.entity.Book;
import com.dncoyote.librarymgmt.mapper.BookMapper;
import com.dncoyote.librarymgmt.repository.AuthorRepository;
import com.dncoyote.librarymgmt.repository.BookRepository;
import com.dncoyote.librarymgmt.service.BookService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Book createBook(BookRequestDto bookdto) {
        List<Long> authorIds = bookdto.getAuthorIds();
        List<Author> authors = new ArrayList<>();
        for (Long authorId : authorIds) {
            Author author = authorRepository.findById(authorId)
                    .orElseThrow(() -> new IllegalArgumentException("Invalid author ID: " +
                            authorId));
            authors.add(author);
        }
        bookdto.setAuthors(authors);
        Book book = BookMapper.mapToBook(bookdto);
        return bookRepository.save(book);
    }
}
