package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	
	@NotNull
	private String fname;
	private String lname;
	private String email;
	private String pnumber;
	private Integer salary;
	private Integer rmid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private ReportingManager rm;
}
