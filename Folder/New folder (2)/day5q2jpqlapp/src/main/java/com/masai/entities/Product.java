package com.masai.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="product.nameAndQty", query="select productName, quantity from Product")
@NamedQuery(name="product.price", query="select productName, price from Product where productId=:id ")
public class Product {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int	productId;
private String	productName;
private double	price;
private int	quantity;

public Product() {
	// TODO Auto-generated constructor stub
}

public Product(int productId, String productName, double price, int quantity) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantity="
			+ quantity + "]";
}



}