package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public void start() {
		System.out.println("Car started...");
	}

	@Override
	public void ride() {

		start();
	}
}
