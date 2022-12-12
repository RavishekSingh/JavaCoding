package com.names;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> nm =Arrays.asList("ram","ramu","sam","samu","viraj","amar");

		List<String> mod= nm.stream().filter(s->s.length()%2==0).collect(Collectors.toList());
		
		mod.sort((s1,s2)->s2.compareTo(s1));
		System.out.println("Original");
		nm.forEach(s->System.out.println(s));
		System.out.println("==============================================================");
		System.out.println("Changed");
		mod.forEach(s->System.out.println(s.toUpperCase()));

	}

}
