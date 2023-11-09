package org.rampup.dao;

import java.util.List;

import org.rampup.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BookRepository bookRepository = (BookRepository) applicationContext.getBean("book_repository");
		
//		Book book = new Book();
//		book.setTitle("test 1");
//		
//		Book book2 = new Book();
//		book2.setTitle("test 2");
//		
//		bookRepository.addBook(book);
//		bookRepository.addBook(book2);
		
//		List<Book> books = bookRepository.selectAll();
//		System.out.println(books);
		
//		Book book = new Book(1, "Persistence");
//		bookRepository.updateBook(book);
		
		bookRepository.delete(10);
	}

}
