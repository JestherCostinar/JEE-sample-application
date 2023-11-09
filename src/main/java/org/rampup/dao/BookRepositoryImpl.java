package org.rampup.dao;

import java.util.List;

import org.rampup.model.Book;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository("book_repository")
public class BookRepositoryImpl implements BookRepository{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void addBook(Book book) {
		entityManager.persist(book);
	}

	@Override
	public void updateBook(Book book) {
		Book existingBook = entityManager.find(Book.class, book.getId());
		existingBook.setTitle(book.getTitle());
	}

	@Override
	public List<Book> selectAll() {
		TypedQuery<Book> query = entityManager.createQuery("SELECT b from Book b", Book.class);
		return query.getResultList();	
	}

	@Override
	public void delete(int id) {
		Book existingBook = entityManager.find(Book.class, id);
		entityManager.remove(existingBook);
		
	}

	@Override
	public Book selectOne(int id) {
		return entityManager.find(Book.class, id);		
	}
}
