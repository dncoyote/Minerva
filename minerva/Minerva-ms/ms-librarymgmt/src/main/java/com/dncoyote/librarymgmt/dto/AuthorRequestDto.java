package com.dncoyote.librarymgmt.dto;

import java.util.List;

import com.dncoyote.librarymgmt.entity.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRequestDto {
    private Long authorId;
    private String name;
    private List<Book> books;
}
