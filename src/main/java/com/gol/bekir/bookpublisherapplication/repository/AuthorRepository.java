package com.gol.bekir.bookpublisherapplication.repository;

import com.gol.bekir.bookpublisherapplication.data.entity.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
