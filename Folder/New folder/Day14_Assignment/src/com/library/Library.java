package com.library;

import java.util.ArrayList;
import java.util.List;

public class Library extends Book {

	List<Book> bookList = new ArrayList<>();

	public void addBook(Book book) {

		bookList.add(book);
		System.out.println("Book added sucessfully");

	}

	public boolean isEmpty() {

		if (bookList.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public List<Book> viewAllBooks() {

		return bookList;

	}

		public List<Book> viewBooksByAuthor(String author) {
               List<Book> newList = new ArrayList<>();
			for(int i=0; i<bookList.size(); i++) {
				Book book = bookList.get(i);
				if(book.getAuthor().equals(author)) {
				newList.add(book);
				}
			}
			return newList;		
		}
	public int countNoOfBook(String bookName) {
        int count=0;
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			if(book.getBookName().equalsIgnoreCase(bookName)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}