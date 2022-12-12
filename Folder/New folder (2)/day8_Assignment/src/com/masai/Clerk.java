package com.masai;

public class Clerk implements Person {

	public void registerStudent(){
		 System.out.println("enroll the Student in Collage");
		
	}

	@Override
	public void work() {

		registerStudent();
	}
}
