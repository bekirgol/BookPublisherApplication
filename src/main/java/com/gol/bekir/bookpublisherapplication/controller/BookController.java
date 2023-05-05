package com.gol.bekir.bookpublisherapplication.controller;

import com.gol.bekir.bookpublisherapplication.data.dto.BookDto;
import com.gol.bekir.bookpublisherapplication.data.request.CreateBookRequest;
import com.gol.bekir.bookpublisherapplication.data.response.TCResponse;
import com.gol.bekir.bookpublisherapplication.service.BookService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<TCResponse<?>> createBook(@RequestBody CreateBookRequest createBookRequest) {
        try {
            BookDto bookDto = bookService.createBook(createBookRequest);
            return ResponseEntity.ok(TCResponse.builder().isSuccess(true).response(bookDto).errorMessage("").build());

        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(TCResponse.builder().isSuccess(false).errorMessage(e.getMessage()).build());
        }
    }

    @GetMapping("{bookId}")
    public ResponseEntity<TCResponse<?>> getBookById(@PathVariable String bookId) {
        try {
            BookDto bookDto = bookService.getBookById(bookId);
            return ResponseEntity.ok(TCResponse.builder().isSuccess(true).response(bookDto).errorMessage("").build());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(TCResponse.builder().isSuccess(false).errorMessage(e.getMessage()).build());
        }
    }

    @GetMapping
    public ResponseEntity<TCResponse<?>> listALl() {
        try {
            List<BookDto> bookDtoList = bookService.getAllBooks();
            return ResponseEntity.ok(TCResponse.builder().isSuccess(true).response(bookDtoList).errorMessage("").build());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(TCResponse.builder().isSuccess(false).errorMessage(e.getMessage()).build());
        }
    }

    @DeleteMapping("{bookId}")
    public ResponseEntity<TCResponse<?>> deleteBook(@PathVariable String bookId) {
        try {
            bookService.deleteBook(bookId);
            return ResponseEntity.ok(TCResponse.builder().isSuccess(true).errorMessage("").build());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(TCResponse.builder().isSuccess(false).errorMessage(e.getMessage()).build());
        }
    }
}
