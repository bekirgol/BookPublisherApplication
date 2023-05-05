package com.gol.bekir.bookpublisherapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BookPublisherApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookPublisherApplication.class, args);
    }
}
