package com.gol.bekir.bookpublisherapplication.repository;

import com.gol.bekir.bookpublisherapplication.data.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
