package com.masai;

public class Student extends Person {

	int studentId;
	String courseEnrolled;
	int courseFee;

	public Student(int id, String course, int fee, String city, String state, String pin) {
		this.studentId = id;
		this.courseEnrolled = course;
		this.courseFee = fee;
		this.a1.city = city;
		this.a1.state = state;
		this.a1.pinCode = pin;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", Address [City=" + a1.city + "," + "State=" + a1.state + ",Pin=" + a1.pinCode + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
