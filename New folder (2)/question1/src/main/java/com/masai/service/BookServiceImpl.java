package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.BookDao;
import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookDao bDao;
	
	@Override
	public List<Book> getAllBooks() throws BookNotFoundException {
		List<Book> bk = bDao.findAll();

		if (bk.size() == 0)
			throw new BookNotFoundException("No Products are there");
		else
			return bk;
	}

	@Override
	public Book getBookById(Integer id) {
	return	bDao.findById(id).get();
		
	}

	@Override
	public Book createBook(Book book) {

		Book bk = bDao.save(book);

		return bk;
	}

	@Override
	public Book deleteBook(Integer id) throws BookNotFoundException {
		Optional<Book> opt = bDao.findById(id);

		if (opt.isPresent()) {

			Book existpd = opt.get();
			bDao.delete(existpd);

			return existpd;
		} else
			throw new BookNotFoundException("Product does not exist with id :" + id);
	}

	@Override
	public Book updateBook(Book bk) throws BookNotFoundException {
		
		Book books=bDao.save(bk);
		return books;

		

	}

}
