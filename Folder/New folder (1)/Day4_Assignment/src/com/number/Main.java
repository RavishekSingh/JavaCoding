package com.number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 2 numbers"
				+ "");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			int q=a/b;
			System.out.println("The quotient of"+" "+a+"/"
					+b+"="+q);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("DivideByZeroException caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
		

	}

}
