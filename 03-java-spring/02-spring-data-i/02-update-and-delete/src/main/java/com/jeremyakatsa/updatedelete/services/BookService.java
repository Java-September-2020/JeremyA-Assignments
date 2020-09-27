package com.jeremyakatsa.updatedelete.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jeremyakatsa.updatedelete.models.Book;
import com.jeremyakatsa.updatedelete.repositories.BookRepository;

@Service
public class BookService {

    // adding the book repository as a dependency
   private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
	 // returns all the books
	    public List<Book> allBooks() {
	        return this.bookRepository.findAll();
	    }
	  // creates a book
	  public Book createBook(Book b) {
	      return bookRepository.save(b);
	  }
	  // retrieves a book
	  public Book findBook(Long id) {
	      Optional<Book> optionalBook = bookRepository.findById(id);
	      if(optionalBook.isPresent()) {
	          return optionalBook.get();
	      } else {
	          return null;
	      }
	  }
	  // finds specific book
	    public Book findBookByIndex(Long id) {
	    	return this.bookRepository.findById(id).orElse(null);
	    }
	  // updates specific book
	    public Book updateBook(Book b) {
	    	return bookRepository.save(b);
	    }
	    
	  //deletes specific book
	    public void deleteBook(Long id) {
	    	this.bookRepository.deleteById(id);
	    }
}
