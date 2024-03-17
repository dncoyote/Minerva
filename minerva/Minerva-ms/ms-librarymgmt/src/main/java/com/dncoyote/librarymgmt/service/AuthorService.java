package com.dncoyote.librarymgmt.service;

import com.dncoyote.librarymgmt.dto.AuthorRequestDto;
import com.dncoyote.librarymgmt.entity.Author;

public interface AuthorService {
    public Author createAuthor(AuthorRequestDto authordto);
}
