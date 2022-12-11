package com.parent;

import java.util.Scanner;

final public class Child extends Parent{
	
	@Override
	void method1() {
		System.out.println("Number is: "+ number);
		 System.out.println("Inside method1()");
	}
	
	void method4() {
	
		 System.out.println("Inside method4()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		Parent p1 = new Child();
		
		if(num>=1 && num<=10) {
			p1.number=num;
		}
		else {
			System.out.println("Invalid Number");
		}
		
		p1.method1();
		p1.method2();
		p1.method3();
		
		Child c1 = (Child)p1;
		c1.method4();

	}

}
