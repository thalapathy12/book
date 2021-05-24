package com.example.book.entity.repository;

import org.springframework.data.repository.CrudRepository;

import java.awt.print.Book;

public interface Bookrepo extends CrudRepository<Book,Long>{
}
