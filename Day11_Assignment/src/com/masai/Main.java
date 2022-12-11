package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Number of Passengers");
		int num = sc.nextInt();
		
		System.out.println("Number of kms");
		int kms = sc.nextInt();
		
		Ola myOla = new Ola();
		Car myCar = myOla.bookCar(num, kms);
		int res = myOla.calculateBill(myCar);
		System.out.println("The total fare amount is"+ res);
		

	}

}
