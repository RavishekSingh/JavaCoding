package com.string;

import java.util.Scanner;

public class String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		System.out.println("Enter a position");
		int pos = sc.nextInt();
		while (pos >= str.length()) {
			System.out.println("Invalid position, Please enter a valid position");

			pos = sc.nextInt();

		}

		System.out.println("Character at the position" + pos + "is" + str);

	}

}
