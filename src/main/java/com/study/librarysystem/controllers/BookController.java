package com.study.librarysystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.librarysystem.entities.Book;
import com.study.librarysystem.repositories.BookRepository;

@RestController
@RequestMapping(value = "/books")
public class BookController {

	@Autowired
	private BookRepository repository;
	
	@GetMapping
	public List<Book> findAllBooks() {
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Book findBookById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Book saveBook(@RequestBody Book book) {
		return repository.save(book);
	}
}
