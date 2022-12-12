package com.masai;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	public void start() {
		System.out.println("bike started....");
	}

	@Override
	public void ride() {
		start();
	}
}
