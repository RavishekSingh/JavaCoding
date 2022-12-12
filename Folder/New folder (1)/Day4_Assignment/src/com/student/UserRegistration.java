package com.student;

import java.util.Scanner;

public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {

		String s="India";
		if(s.equalsIgnoreCase(userCountry)) {
			System.out.println("User registration done successfully");
		}
		else {
			InvalidCountryException ie=new InvalidCountryException("User Outside India cannot be registered");
			throw ie;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration u1=new UserRegistration();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc.next();
		System.out.println("Enter Your Country:");
		String country=sc.next();
		
		try {
			u1.registerUser(name, country);
			
		}
		catch (InvalidCountryException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Thankyou");

	}

}
