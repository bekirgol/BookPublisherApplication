package com.gol.bekir.bookpublisherapplication.data.mapper;

import com.gol.bekir.bookpublisherapplication.data.dto.BookDto;
import com.gol.bekir.bookpublisherapplication.data.entity.Book;
import com.gol.bekir.bookpublisherapplication.data.request.CreateBookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper BOOK_MAPPER = Mappers.getMapper(BookMapper.class);

    BookDto convertBookDto(Book book);

    Book createBook(CreateBookRequest createBookRequest);
}
