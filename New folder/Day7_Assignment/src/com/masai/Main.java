package com.masai;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str = sc.next();
		
		System.out.println("Enter the character position you want to access:");
		int pos = sc.nextInt();
		
		System.out.println("Character at position "+pos+" is :"+str.charAt(pos));
		

	}

}
