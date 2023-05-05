package com.gol.bekir.bookpublisherapplication.data.mapper;

import com.gol.bekir.bookpublisherapplication.data.dto.AuthorDto;
import com.gol.bekir.bookpublisherapplication.data.entity.Author;
import com.gol.bekir.bookpublisherapplication.data.request.CreateAuthorRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    AuthorMapper AUTHOR_MAPPER = Mappers.getMapper(AuthorMapper.class);

    AuthorDto convertAuthorDto(Author author);

    Author createAuthor(CreateAuthorRequest createAuthorRequest);
}
