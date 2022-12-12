package com.masai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<Product> q = new PriorityQueue<>(new ProductPriceComp());

		System.out.println("1 to add");
		System.out.println("2 to exit");

		System.out.println("Enter choice");
		int choice = sc.nextInt();

		while (choice != 2) {
			System.out.println("Enter product id");
			int id = sc.nextInt();
			System.out.println("Enter product name");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Enter product price");
			int price = sc.nextInt();
			System.out.println("Enter choice");
			choice = sc.nextInt();
			Product prod = new Product(id, name, price);
			q.offer(prod);
		}
		List<Product> list = new ArrayList<>();

		Product p;

		while ((p = q.poll()) != null) {
			// System.out.println(p);
			list.add(p);
		}

		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			Product s = itr.next();
			System.out.println(s);
		}
	}

}
