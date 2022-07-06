package com.naren.bookstore.Service;

import com.naren.bookstore.Entity.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);

    void deleteBookById(Long bookId);

    List<Book> getAllBooks();

    Book findByAuthor(String author);

    Book findByTitle(String title);

    Book findByPriceGreaterThan(Double price);

}
