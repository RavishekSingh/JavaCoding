package com.masai;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> aL = new ArrayList<>();

		aL.add("Delhi");
		aL.add("Punjab");
		aL.add("Pune");
		aL.add("Kolkata");
		aL.add("Mumbai");

		for (int i = 0; i < aL.size(); i++) {
			
			System.out.println(aL.get(i));

		}
		System.out.println("----------------------------------------------");
		for(String st:aL) {
			System.out.println(st);
		}
		System.out.println("------------------------------------------------------");
		
		Iterator<String> it = aL.iterator();

	   
		while(it.hasNext()) {
			  System.out.println(it.next());
			}

	}

}
