package com.state;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		TreeMap<String, List<String>> tm = new TreeMap<>(Collections.reverseOrder());

		tm.put("West Bengal", Arrays.asList("Kolkata", "Haldia", "Durgapur", "Kharagpur"));
		tm.put("Bihar", Arrays.asList("Patna", "Chhapra", "Gaya", "Samastipur"));
		tm.put("Jharkhand", Arrays.asList("Ranchi", "Jamshedpur", "Dhanbad", "wasseypur"));
		tm.put("Maharashtra", Arrays.asList("Pune", "Nasik", "Kolhapur", "Mumbai"));
		tm.put("Orissa", Arrays.asList("Bubhaneshwar", "Cuttack", "Berhampore", "Puri"));

		System.out.println(tm);

	}

}
