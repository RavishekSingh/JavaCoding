package com.library;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("1.Add Book\r\n" + "2.Display all book details\r\n" + "3.Search Book by author\r\n"
				+ "4.Count number of books - by book name\r\n" + "5.Exit\r\n" + "");
		Library l1 = new Library();
		while (true) {

			System.out.println("Enter your choice:");

			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("Enter the isbn no:");
				int isbn = sc.nextInt();

				System.out.println("Enter the book name:");
				String name = sc.next();

				System.out.println("Enter the author name:");
				String authname = sc.next();

				Book b1 = new Book(isbn, name, authname);

				l1.addBook(b1);
			} else if (choice == 2) {

				boolean b1 = l1.isEmpty();
				if (b1 == true) {
					System.out.println("library is empty");
				} else {

					List<Book> allBooks = l1.viewAllBooks();
					for (int i = 0; i < allBooks.size(); i++) {

						Book book = allBooks.get(i);

						System.out.println("Isbn is :" + book.getIsbn());
						System.out.println("Bookname is :" + book.getBookName());
						System.out.println("Book Author name is :" + book.getAuthor());

						System.out.println("================================");

					}
				}

			} else if (choice == 3) {
				System.out.println("Enter the author name");
				String authName = sc.next();
				List<Book> authBooks = l1.viewBooksByAuthor(authName);
				if (authBooks.size() > 0) {
					for (int i = 0; i < authBooks.size(); i++) {

						Book book = authBooks.get(i);

						System.out.println("Isbn is :" + book.getIsbn());
						System.out.println("Bookname is :" + book.getBookName());
						System.out.println("Book Author name is :" + book.getAuthor());

						System.out.println("================================");

					}
				} else {
					System.out.println("None of the book published by the author" + " " + authName);
				}

			} else if (choice == 4) {
				System.out.println("Enter book name");
				String bookName = sc.next();
				int noOfBook = l1.countNoOfBook(bookName);
				System.out.println("Number of books of " + bookName + " " + "is" + noOfBook);
			}
			
			else if(choice==5) {
				System.out.println("Thank You..!!");
				break;
			}

		}

	}

}