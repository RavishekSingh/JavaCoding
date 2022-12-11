package com.masai.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;
import com.masai.service.BookService;


@RestController
public class BookController {

	@Autowired
	private BookService bService;
	
	
	@GetMapping("/books")
	   public ResponseEntity<List<Book>> getAllBookDetails() throws BookNotFoundException{
		  
		List<Book> list = bService.getAllBooks();

		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	   }
	   
	   @GetMapping("/books/{BookId}")
	   public ResponseEntity<Book>  getBookById(@PathVariable("BookId") Integer bookId) throws BookNotFoundException {
			return new ResponseEntity<Book>(bService.getBookById(bookId),HttpStatus.CREATED);

		
	   }
	   
	   @PostMapping("/books")
	   public ResponseEntity<Book> registerProduct(@RequestBody Book bk) throws BookNotFoundException{
			
			Book prd=bService.createBook(bk);
			
			return new ResponseEntity<Book>(prd,HttpStatus.CREATED);
			
		}
	   
	  
	 
	   @PutMapping("/books")
	   public ResponseEntity<Book> updateBookHandler(@RequestBody Book bk) throws BookNotFoundException{
			
			Book uppd = bService.updateBook(bk);
			
			return new ResponseEntity<Book>(uppd,HttpStatus.ACCEPTED);
		}
	   
	   @DeleteMapping("/books/{BookId}")
	   public ResponseEntity<Book> deleteBookByIdHandler(@PathVariable("BookId") Integer bookId) throws BookNotFoundException{
			
			Book delepd= bService.deleteBook(bookId);
			
			return new ResponseEntity<Book>(delepd,HttpStatus.OK);
			
		}
}
