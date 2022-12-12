package com.date;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dob in dd-MM-yyyy format");
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		String db = sc.next();
		try {
			LocalDate ld = LocalDate.parse(db, dt);
			LocalDate ld1 = LocalDate.now();
			Period p = Period.between(ld, ld1);
			if (p.getYears() > 0) {
				System.out.println("Age:" + " " + p.getYears());
			} else {
				System.out.println("Date should not be in Future");
			}
		} catch (DateTimeException dp) {
			System.out.println("Please enter the date in correct format");
		}

	}

}
