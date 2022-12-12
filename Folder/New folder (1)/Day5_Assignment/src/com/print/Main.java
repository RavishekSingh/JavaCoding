package com.print;

import java.util.Arrays;
import java.util.List;

public class Main implements PrintList {

	@Override
	public void display(List<String> city) {
		// TODO Auto-generated method stub

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> c = Arrays.asList("Pune", "Kolkata", "Mumbai", "Kerala", "Goa");

PrintList i3= city -> System.out.println(city);
		
		i3.display(c);
		
	}

}
