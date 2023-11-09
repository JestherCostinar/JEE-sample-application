package org.rampup.dao;

import java.util.List;

import org.rampup.model.Book;

public interface BookRepository {
	void addBook(Book book);
	void updateBook(Book book);
	List<Book> selectAll();
	void delete(int id);
	Book selectOne(int id);
}
