package com.library;

import java.util.HashSet;
import java.util.Iterator;

public class Library {
	
	HashSet<Book> booksCollection = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Library library = new Library();
	
	library.booksCollection.add(new Book(1,"Name1","Author1"));
	library.booksCollection.add(new Book(2,"Name2","Author1"));
	library.booksCollection.add(new Book(3,"Name1","Author1"));
	library.booksCollection.add(new Book(1,"Name4","Author2"));
	
	Iterator<Book> iterator = library.booksCollection.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}


	}

	

}
