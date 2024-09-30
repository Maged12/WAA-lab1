package com.cs545.lab1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs545.lab1.domain.Book;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getMethodName() {
        return List.of(new Book(1, "Book 1", "ISBN 1"), new Book(2, "Book 2", "ISBN 2"));
    }

}
