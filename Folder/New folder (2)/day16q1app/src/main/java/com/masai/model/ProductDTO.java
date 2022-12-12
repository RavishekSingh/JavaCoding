package com.masai.model;

public class ProductDTO {

private String	productName;
private Integer	puantity;
private Double	price;

public ProductDTO() {
	// TODO Auto-generated constructor stub
}

public ProductDTO(String productName, Integer puantity, Double price) {
	super();
	this.productName = productName;
	this.puantity = puantity;
	this.price = price;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public Integer getPuantity() {
	return puantity;
}

public void setPuantity(Integer puantity) {
	this.puantity = puantity;
}

public Double getPrice() {
	return price;
}

public void setPrice(Double price) {
	this.price = price;
}



}
