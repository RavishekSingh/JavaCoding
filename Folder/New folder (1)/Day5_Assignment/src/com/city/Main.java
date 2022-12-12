package com.city;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> city = Arrays.asList("Pune", "kolkata", "Mumbai", "Delhi", "Goa");

		Collections.sort(city,(o1,o2)->(o2.compareToIgnoreCase(o1)));
		System.out.println(city);
	}

}
