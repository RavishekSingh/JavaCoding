package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class ReportingManager {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer rid;
	
	@NotNull
	private String fname;
	private String lname;
	private String email;
	private String pnumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Employee> el=new ArrayList<>();
}
