package com.naren.bookstore.Repository;

import com.naren.bookstore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByAuthor(String author);
    Book findByTitle(String title);
    Book findByPriceGreaterThan(Double price);

}