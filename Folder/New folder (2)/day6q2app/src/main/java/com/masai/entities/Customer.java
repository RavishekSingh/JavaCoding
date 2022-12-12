package com.masai.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int	cid;
private String	name;
private String	mobileNumber;
private String	email;

@ElementCollection(fetch = FetchType.EAGER)
@Embedded
private List<Address> adr=new ArrayList<>();

public Customer() {
	// TODO Auto-generated constructor stub
}

public Customer(String name, String mobileNumber, String email) {
	super();
	
	this.name = name;
	this.mobileNumber = mobileNumber;
	this.email = email;

}

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public List<Address> getAdr() {
	return adr;
}

public void setAdr(List<Address> adr) {
	this.adr = adr;
}

@Override
public String toString() {
	return "Customer [cid=" + cid + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email + ", adr="
			+ adr + "]";
}




}
