package org.rampup.service;

import java.util.List;

import org.rampup.dao.BookRepository;
import org.rampup.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service("book_service")
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	@Transactional
	public void createBook(Book book) {
		bookRepository.addBook(book);
		
	}

	@Override
	@Transactional
	public void updateBook(Book book) {
		bookRepository.updateBook(book);
		
	}

	@Override
	@Transactional
	public List<Book> getAllBooks() {
		return bookRepository.selectAll();
	}

	@Override
	@Transactional
	public void deleteBook(int id) {
		bookRepository.delete(id);
		
	}

	@Override
	@Transactional
	public Book findBookById(int id) {
		return bookRepository.selectOne(id);
	}

}
