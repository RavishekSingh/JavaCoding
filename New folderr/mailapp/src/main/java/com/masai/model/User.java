package com.masai.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Email
	private String email;
	@Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$")
	private String firstName;
	@Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$")
	private String lastName;
	@Size(min=0,max=10)
	private String mobileNumber;
	@Size(min=6, max=10)
	private String password;
	private LocalDate dateOfBirth;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Mails> emails = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Mails> star=new ArrayList<>();
}
