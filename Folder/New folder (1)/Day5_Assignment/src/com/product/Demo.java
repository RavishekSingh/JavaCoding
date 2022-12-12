package com.product;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> pr = Arrays.asList(new Product(10, "Soap", 2, 50), new Product(20, "Sugar", 12, 500),
				new Product(30, "Salt", 10, 600), new Product(40, "Mug", 5, 150), new Product(50, "Bed", 1, 2000));

		Collections.sort(pr,
				(o1, o2) -> (o1.getPrice() > o2.getPrice()) ? -1 : (o1.getPrice() < o2.getPrice()) ? 1 : 0);

		System.out.println(pr);
	}

}
