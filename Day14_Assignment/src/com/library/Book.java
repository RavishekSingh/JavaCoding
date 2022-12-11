package com.library;

public class Book {

	private int isbn;
	private String bookName;
	private String author;

	public Book() {

	}

	public Book(int isbn, String bookName, String author) {
		
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;

	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
