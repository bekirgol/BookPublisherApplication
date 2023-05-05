package com.gol.bekir.bookpublisherapplication.service.impl;

import com.gol.bekir.bookpublisherapplication.data.dto.AuthorDto;
import com.gol.bekir.bookpublisherapplication.data.entity.Author;
import com.gol.bekir.bookpublisherapplication.data.request.CreateAuthorRequest;
import com.gol.bekir.bookpublisherapplication.repository.AuthorRepository;
import com.gol.bekir.bookpublisherapplication.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.gol.bekir.bookpublisherapplication.data.mapper.AuthorMapper.AUTHOR_MAPPER;

@Service
@RequiredArgsConstructor
public class DefaultAuthorService implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorDto createAuthor(CreateAuthorRequest createAuthorRequest) {
        Author author = AUTHOR_MAPPER.createAuthor(createAuthorRequest);
        return AUTHOR_MAPPER.convertAuthorDto(authorRepository.save(author));
    }
}
