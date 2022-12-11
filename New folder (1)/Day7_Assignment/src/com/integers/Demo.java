package com.integers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
		//System.out.println(arr);

//		Stream<Integer> arr1 = arr.stream();
//
//		Stream<Integer> arr2 = arr1.map(s -> {
//
//			Integer s2 = s * s;
//
//			return s2;
//
//		});
//
//		List<Integer> modifiedList = arr2.collect(Collectors.toList());
//
//		System.out.println(modifiedList);

		List<Integer> modifiedList = arr.stream().map(s -> s * s).collect(Collectors.toList());

		//System.out.println(modifiedList);
		
		arr.forEach(p -> System.out.print(p + " "));
		
		System.out.println();
		
		modifiedList.forEach(p -> System.out.print(p + " "));
	}

}
