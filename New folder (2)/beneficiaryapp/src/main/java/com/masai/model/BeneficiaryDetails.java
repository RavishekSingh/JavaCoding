package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
//@Data
public class BeneficiaryDetails {

	@Size(min=2, max=10,message = "Name length min=2 and max=10")
	@NotNull(message = "Name is mandatory")
	private String name;
	
	@Id
	@NotNull(message = "MobileNumber is mandatory")
	private String mobilenumber;

	
	public BeneficiaryDetails() {
		// TODO Auto-generated constructor stub
	}

	public BeneficiaryDetails(String name, String mobilenumber) {
		super();
		this.name = name;
		this.mobilenumber = mobilenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "BeneficiaryDetails [name=" + name + ", mobilenumber=" + mobilenumber + "]";
	}

}
