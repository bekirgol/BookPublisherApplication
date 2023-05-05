package com.gol.bekir.bookpublisherapplication.service;

import com.gol.bekir.bookpublisherapplication.data.dto.AuthorDto;
import com.gol.bekir.bookpublisherapplication.data.request.CreateAuthorRequest;

public interface AuthorService {
    AuthorDto createAuthor(CreateAuthorRequest createAuthorRequest);
}
