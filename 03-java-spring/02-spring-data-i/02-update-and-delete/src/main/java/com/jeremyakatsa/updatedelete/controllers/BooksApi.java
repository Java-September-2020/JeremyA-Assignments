package com.jeremyakatsa.updatedelete.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jeremyakatsa.updatedelete.models.Book;
import com.jeremyakatsa.updatedelete.services.BookService;

@RestController
@RequestMapping("/api/books")
public class BooksApi {
    private BookService bookService;
    
    public void Books(BookService bookService){
        this.bookService = bookService;
    }
    
    @RequestMapping("/")
    public List<Book> index() {
    	System.out.println("hello");
        return bookService.allBooks();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    @RequestMapping("/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
    public Book update(@PathVariable("id") Long id, Book b) {
        Book book = bookService.updateBook(b);
        return book;
    }
    
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public void destroy(@PathVariable("id") Long id) {
        this.bookService.deleteBook(id);
    }
}
