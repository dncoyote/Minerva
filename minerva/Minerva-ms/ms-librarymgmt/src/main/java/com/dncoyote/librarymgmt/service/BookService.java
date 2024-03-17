package com.dncoyote.librarymgmt.service;

import com.dncoyote.librarymgmt.dto.BookRequestDto;
import com.dncoyote.librarymgmt.entity.Book;

public interface BookService {
    public Book createBook(BookRequestDto bookdto);
}
