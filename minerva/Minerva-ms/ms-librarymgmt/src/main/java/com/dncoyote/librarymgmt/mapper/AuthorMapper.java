package com.dncoyote.librarymgmt.mapper;

import com.dncoyote.librarymgmt.dto.AuthorRequestDto;
import com.dncoyote.librarymgmt.entity.Author;

public class AuthorMapper {
    public static AuthorRequestDto mapToAuthorDto(Author author) {
        return new AuthorRequestDto(author.getAuthorId(), author.getName(), author.getBooks());
    }

    public static Author mapToAuthor(AuthorRequestDto authorDto) {
        return new Author(authorDto.getAuthorId(), authorDto.getName(), authorDto.getBooks());
    }
}
