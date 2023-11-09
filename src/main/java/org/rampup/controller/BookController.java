package org.rampup.controller;

import java.util.List;

import org.rampup.model.Book;
import org.rampup.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Book findBookById(@PathVariable int id) {
		return bookService.findBookById(id);
	}
}
