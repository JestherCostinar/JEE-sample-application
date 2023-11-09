package org.rampup.service;

import java.util.List;

import org.rampup.dao.BookRepository;
import org.rampup.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookService bookService = (BookService) applicationContext.getBean("book_service");
		
//		Book book = new Book();
//		book.setTitle("test 1");
//		
//		Book book2 = new Book();
//		book2.setTitle("test 2");
//
//		bookService.createBook(book);
//		bookService.createBook(book2);
		
		List<Book> books = bookService.getAllBooks();
		System.out.println(books);
		
//		Book book = new Book(4, "Hibernate");
//		bookService.updateBook(book);
		
//		Book exisitingBook = bookService.findBookById(11);
//		System.out.println(exisitingBook);
		
//		bookService.deleteBook(12);

	}

}
