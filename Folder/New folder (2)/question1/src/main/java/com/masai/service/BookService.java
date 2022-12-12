package com.masai.service;

import java.util.List;

import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;

public interface BookService {

	public List<Book> getAllBooks() throws BookNotFoundException;

	public Book getBookById(Integer id) throws BookNotFoundException;

	public Book createBook(Book book) throws BookNotFoundException;

	public Book deleteBook(Integer id) throws BookNotFoundException;

	public Book updateBook(Book bk) throws BookNotFoundException;

}
