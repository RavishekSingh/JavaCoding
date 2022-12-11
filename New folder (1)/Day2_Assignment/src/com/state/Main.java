package com.state;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String, String> id = new LinkedHashMap<>();
		id.put("West Bengal", "Kolkata");
		id.put("Tamil Nadu", "Chennai");
		id.put("Karnataka", "Bangalore");
		id.put("Maharashtra", "Mumbai");
		id.put("Punjab", "Chandigarh");

		Set<Map.Entry<String, String>> set = id.entrySet();

		for (Map.Entry<String, String> p : set) {
			System.out.println(p);
		}

	}

}
