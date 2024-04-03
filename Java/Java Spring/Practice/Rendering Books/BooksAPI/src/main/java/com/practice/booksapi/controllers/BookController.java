package com.practice.booksapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practice.booksapi.models.Book;
import com.practice.booksapi.services.BookService;

@Controller 
public class BookController {
	
	@Autowired
	BookService bookservice;
	
	@GetMapping("/api/books/{bookID}")
	public String index(Model model,@PathVariable("bookID") Long bookID ) {
		
		Book book = bookservice.findBook(bookID);
		model.addAttribute("book",book);
		return "show.jsp";
	}

}
