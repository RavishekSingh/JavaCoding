package com.masai.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;

@RestController
public class BookController {

   private List<Book> books=new ArrayList<>();
	
   public BookController() {

	   books.add(new Book(10,"Java","Ratan",2000));
	   books.add(new Book(20,"C++","Venu",3000));
	   books.add(new Book(30,"JS","Varun",6000));
	   books.add(new Book(40,"C","Aman",5000));
	   books.add(new Book(50,"Phython","Ram",4000));	   
   }
   
   @GetMapping("/books")
   public List<Book> getAllBookDetails(){
	  
	   return books;
   }
   
   @GetMapping("/books/{BookId}")
   public ResponseEntity<Book>  getBookById(@PathVariable("BookId") Integer BookId) throws BookNotFoundException {
	   
	 List<Book> list=  books.stream().filter(s->s.getBookId()==BookId).collect(Collectors.toList());
	 
	 if(list.size()==0)
		 throw new BookNotFoundException("Book does not exist with id "+BookId);
	 
	 //return list.get(0);
	 
	 HttpHeaders hh =new HttpHeaders();
	 hh.add("user", "admin");
	 hh.add("hello", "abc");
   
	 return new ResponseEntity<Book>(list.get(0),hh,HttpStatus.OK);
   }
   
   @PostMapping("/books")
   public ResponseEntity<String>  addNewBook(@Valid @RequestBody Book book) {
	   
	   books.add(book);
	   
	   //return "Book added successfully!";
   
	   return new ResponseEntity<String>("Book added successfully",HttpStatus.CREATED);
   }
   
   @PutMapping("/books/{BookId}")
   public Book updateBook(@Valid @RequestBody Book book, @PathVariable("BookId") Integer BookId) throws BookNotFoundException {
	   
	   boolean flag=true;
	   
	   for(Book bk:books) {
		   if(bk.getBookId()==BookId) {
			   bk.setName(book.getName());
			   bk.setAuthor(book.getAuthor());
			   bk.setPrice(book.getPrice());
			   flag=false;
			   break;
		   }
	   }
	   
	   if(flag)
			 throw new BookNotFoundException("Book does not exist with id "+BookId);
	   
	   return book;
   }
 
   @PutMapping("/bookspriceupdate/{BookId}")
   public String updateBook(@PathVariable("BookId") Integer BookId, @RequestParam("price") Integer price) throws BookNotFoundException {
	   
	   boolean flag=true;
	   
	   for(Book bk:books) {
		   if(bk.getBookId()==BookId) {
			   bk.setPrice(bk.getPrice()+price);
			   flag=false;
			   break;
		   }
	   }
	   
	   if(flag)
			 throw new BookNotFoundException("Book does not exist with id "+BookId);
	   
	   return "Book price updated";
   }
   
   @DeleteMapping("/books/{BookId}")
   public String deleteBookById(@PathVariable("BookId") Integer BookId) throws BookNotFoundException {
	   
	   boolean flag=books.removeIf(s->s.getBookId()==BookId);
	   
	   if(flag)
		   return "Book Deleted successfully!";
	   else
			 throw new BookNotFoundException("Book does not exist with id "+BookId);

   }
   
 
}
