package com.masai;

public class Instructor extends Person {

	int instructorId;
	int salary;

	public Instructor(int instructorId, int salary, String city, String state, String pin) {

		this.instructorId = instructorId;
		this.salary = salary;
		this.a1.city = city;
		this.a1.state = state;
		this.a1.pinCode = pin;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", Address [City=" + a1.city + ","
				+ "State=" + a1.state + ",Pin=" + a1.pinCode + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
