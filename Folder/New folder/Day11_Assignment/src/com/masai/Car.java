package com.masai;

public class Car {

	private int numberOfPassenger;
	private int numberOfKms;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int numberOfPassenger, int numberOfKms) {

		this.numberOfPassenger = numberOfPassenger;
		this.numberOfKms = numberOfKms;

	}

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
