package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Book;
import com.bookStore.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository brep;
	public void save(Book b) {
		brep.save(b);
		
	}
	
	public List<Book> getAllBook(){
		return brep.findAll();
	}
	
	public Book getBookById(int id) {
		return brep.findById(id).get();
	}
	
	public void deleteById(int id) {
		brep.deleteById(id);
	}

	
	

}
