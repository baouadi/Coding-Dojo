package com.practice.booksapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.practice.booksapi.models.Book;
import com.practice.booksapi.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
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
   
    
    public List<Book> booksContaining(String search){
    	return bookRepository.findByDescriptionContaining(search);
    }
	public void deleteBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
		}	
	}
	
	 public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
	        Optional<Book> optionalBook = bookRepository.findById(id);
	        if(optionalBook.isPresent()) {
	            Book book = optionalBook.get();
	            if(title != null) {
	                book.setTitle(title);
	            }
	            if(desc != null) {
	                book.setDescription(desc);
	            }
	            if(lang != null) {
	                book.setLanguage(lang);
	            }
	            if(numOfPages != null) {
	                book.setNumberOfPages(numOfPages);
	            }
	            return bookRepository.save(book);
	        } else {
	            return null;
	        }
	    }

}

