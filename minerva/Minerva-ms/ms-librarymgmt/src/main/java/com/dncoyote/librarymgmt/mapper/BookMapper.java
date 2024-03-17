package com.dncoyote.librarymgmt.mapper;

import com.dncoyote.librarymgmt.dto.BookRequestDto;
import com.dncoyote.librarymgmt.entity.Book;

public class BookMapper {

    // public static BookRequestDto mapToBookDto(Book book) {
    // return new BookRequestDto(book.getBookId(), book.getTitle(), book.);
    // }

    public static Book mapToBook(BookRequestDto bookDto) {
        return new Book(bookDto.getBookId(), bookDto.getTitle(), bookDto.getAuthors());
    }
}