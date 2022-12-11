package com.age;

import java.util.Scanner;

public class Age {

	public double calculateAverage(int[] age) {

		double sum = 0;

		for (int i = 0; i < age.length; i++) {
			sum = sum + age[i];
		}
		double avg = sum / age.length;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Age a1 = new Age();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of Employees");
		int num = sc.nextInt();

		if (num >= 2) {
			System.out.println("Enter the age of Employees");

			int[] emp = new int[num];

			for (int i = 0; i < emp.length; i++) {
				int e = sc.nextInt();
				emp[i] = e;

			}
			double avg = a1.calculateAverage(emp);
			System.out.println("The average age is " + avg);
		} else {
			System.out.println("Please enter a valid employee count");
		}

	}

}
