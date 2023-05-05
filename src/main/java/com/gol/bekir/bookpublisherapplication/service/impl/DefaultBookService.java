package com.gol.bekir.bookpublisherapplication.service.impl;

import com.gol.bekir.bookpublisherapplication.data.dto.BookDto;
import com.gol.bekir.bookpublisherapplication.data.entity.Book;
import com.gol.bekir.bookpublisherapplication.data.request.CreateBookRequest;
import com.gol.bekir.bookpublisherapplication.repository.BookRepository;
import com.gol.bekir.bookpublisherapplication.service.BookService;
import jakarta.annotation.Nullable;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.gol.bekir.bookpublisherapplication.data.mapper.BookMapper.BOOK_MAPPER;

@Service
@RequiredArgsConstructor
public class DefaultBookService implements BookService {
    private final BookRepository bookRepository;

    @Override
    public BookDto createBook(CreateBookRequest createBookRequest) {
        Book book = BOOK_MAPPER.createBook(createBookRequest);
        return BOOK_MAPPER.convertBookDto(bookRepository.save(book));
    }

    @Override
    @Nullable
    public BookDto getBookById(String bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        return BOOK_MAPPER.convertBookDto(book.get());
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<BookDto> bookDtoList = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            bookDtoList.add(BOOK_MAPPER.convertBookDto(book));
        }
        return bookDtoList;
    }

    @Override
    public void deleteBook(String bookId) {
        bookRepository.deleteById(bookId);
    }
}
