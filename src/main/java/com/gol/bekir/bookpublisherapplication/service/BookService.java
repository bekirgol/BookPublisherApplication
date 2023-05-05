package com.gol.bekir.bookpublisherapplication.service;

import com.gol.bekir.bookpublisherapplication.data.dto.BookDto;
import com.gol.bekir.bookpublisherapplication.data.entity.Book;
import com.gol.bekir.bookpublisherapplication.data.request.CreateBookRequest;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

public interface BookService {

    BookDto createBook(CreateBookRequest createBookRequest);

    BookDto getBookById(String bookId);

    List<BookDto> getAllBooks();

    void deleteBook(String bookId);
}
