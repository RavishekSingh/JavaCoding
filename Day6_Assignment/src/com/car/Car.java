package com.car;

public class Car {
	String model;
	String companyName;
	String Color;
	Engine engine;

	Engine E = new Engine();

	Car() {

	}

	Car(String model, String companyName, String Color, int rpm, int power, String manufacturer, boolean hasTurbo) {
		this.model = model;
		this.companyName = companyName;
		this.Color = Color;
		this.E.rpm = rpm;
		this.E.Power = power;
		this.E.manufacturer = manufacturer;
		this.E.hasTurbo = hasTurbo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
