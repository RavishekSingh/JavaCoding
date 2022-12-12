package com.masai;

import java.util.Comparator;

public class ProductPriceComp implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {

		return p1.getProductPrice() < p2.getProductPrice() ? +1 : -1;
	}

}
