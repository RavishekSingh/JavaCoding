package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Travel {

	@Autowired
	@Qualifier("bike")
	private Vehicle v;

	@PostConstruct
	public void setUp() {
		System.out.println("inside myConstruct  method");

	}

	@PreDestroy
	public void tearDown() {
		System.out.println("inside myDestroy method");
	}

	public void journey() {

		v.ride();
		System.out.println("Jounrney started...");
	}

}
