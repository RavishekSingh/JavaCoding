package com.masai.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@NotNull
	private String email;
	
	@NotNull
	private String firstName;
	private String lastName;
	
	@Size(min=10)
	private String mobileNumber;
	
	@Past
	private LocalDate dateOfBirth;
	
	@Size(min=6,max=12)
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Event> event=new ArrayList<>();
}
