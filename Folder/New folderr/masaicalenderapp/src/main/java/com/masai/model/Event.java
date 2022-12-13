package com.masai.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

	@Id
	private String id;
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "event")
	@JsonIgnore
	private List<User> user=new ArrayList<>();
}
