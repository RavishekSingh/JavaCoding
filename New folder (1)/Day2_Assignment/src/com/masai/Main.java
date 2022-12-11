package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static List<? super Integer> ans(List<? super Integer> list) {

		return list;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n:");
		int n = sc.nextInt();
		System.out.println("Enter number for List<Number>:");
		List<Number> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println("List<Number>:" + " " + ans(list));

		System.out.println("....................................................");

		System.out.println("Enter number for List<Object>:");
		List<Object> list1 = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("List<Object>:" + " " + ans(list1));
	}

}
