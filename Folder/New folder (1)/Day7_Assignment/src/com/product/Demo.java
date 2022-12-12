package com.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> p1 = new ArrayList<>();
		List<Product> p = new ArrayList<>();
		p.add(new Product(10, "Soap", 180, 15));
		p.add(new Product(20, "Salt", 10, 2));
		p.add(new Product(30, "Basket", 1200, 4));
		p.add(new Product(40, "Sugar", 1000, 10));
		p.add(new Product(50, "Mug", 150, 12));

		p.forEach(s -> {
			System.out.println(s);
		});
		p.removeIf(s -> s.getQuantity() <= 10);

		for (Product i : p) {
			p1.add(i);

		}
		// System.out.println(p1);

		Collections.sort(p1, (s1, s2) -> s1.getPrice() > s2.getPrice() ? 1 : -1);
		// System.out.println(p1);
		System.out.println("=========================================================================");

		p1.forEach(s -> {
			System.out.println(s);
		});
	}

}
