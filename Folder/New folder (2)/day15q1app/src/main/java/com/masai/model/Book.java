package com.masai.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Book {

	@NotNull(message = "Book ID is mandatory")
	@Min(value = 1, message = "Book ID must be greater than 1")
	private Integer BookId;
	
	@Size(min=2,max=10, message = "{name.invalid}")
	private String name;
	
	@Size(min=2,max=10, message = "Author Name length should be min 2 and max 10")
	private String author;
	
	@NotNull(message = "Price is mandatory")
	private Integer price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(Integer bookId, String name, String author, Integer price) {
		super();
		BookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Integer getBookId() {
		return BookId;
	}

	public void setBookId(Integer bookId) {
		BookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
