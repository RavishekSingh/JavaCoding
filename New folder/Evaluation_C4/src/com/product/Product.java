package com.product;

public class Product {

	public String name;
	public double price;
	public String company;
	public int count;

	public Product(String name, double price, String company, int count) {
		
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]";
	}

}
