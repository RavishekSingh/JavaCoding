package com.integer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		String s=sc.next();
		
		try {
			int n=Integer.parseInt(s);
			System.out.println("The square value is"+" "+n*n);
		}
		catch(NumberFormatException ne) {
			System.out.println("Entered input is not a valid format for an integer.");
		}
		System.out.println("The work has been done successfully");

	}

}
