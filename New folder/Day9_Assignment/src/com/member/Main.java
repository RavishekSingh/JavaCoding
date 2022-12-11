package com.member;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		
		e1.name ="Ram";
		e1.age = 25;
		e1.phoneNumber = "123456789";
		e1.address = "Mumbai";
		e1.salary = 10.00;
		
		System.out.println("Employee name is : "+" "+e1.name);
		System.out.println("Employee age is : "+" "+e1.age);
		System.out.println("Employee phone number is : "+" "+e1.phoneNumber);
		System.out.println("Employee address is : "+" "+e1.address);
		e1.printSalary();
		
		
		System.out.println("................................................");

		
		Manager m1 = new Manager();
		
		m1.name ="Ramesh";
		m1.age = 28;
		m1.phoneNumber = "123459";
		m1.address = "Mumbai";
		m1.salary = 15.00;
		
		System.out.println("Manager name is : "+" "+m1.name);
		System.out.println("Manager age is : "+" "+m1.age);
		System.out.println("Manager phone number is : "+" "+m1.phoneNumber);
		System.out.println("Manager address is : "+" "+m1.address);
		m1.printSalary();
		
	}

}
