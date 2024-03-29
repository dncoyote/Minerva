package com.dncoyote.librarymgmt.dto;

import java.util.List;

import com.dncoyote.librarymgmt.entity.Author;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDto {
    private Long bookId;
    private String title;
    private List<Long> authorIds;
    private List<Author> authors;
}
