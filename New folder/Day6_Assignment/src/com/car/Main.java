package com.car;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("Scorpio", "Mahindra", "black", 1100, 1220, "Mahindra", true);
		System.out.println("Model is :" + " " + c1.model);
		System.out.println("Company Name is :" + " " + c1.companyName);
		System.out.println("Color is :" + " " + c1.Color);
		System.out.println("RPM is is :" + " " + c1.E.rpm);
		System.out.println("Poweris is :" + " " + c1.E.Power);
		System.out.println("Manufacturer is is :" + " " + c1.E.manufacturer);
		System.out.println("Turbo is is :" + " " + c1.E.hasTurbo);
		
		
		System.out.println("............................................................");
		
		
		
		Car c2 = new Car();
		c2.model = "Bolero";
		c2.companyName = "Mahindra";
		c2.Color = "Grey";
		Engine E = new Engine();
		c2.E.rpm = 1200;
		c2.E.Power = 1100;
		c2.E.manufacturer = "Mahindra";
		c2.E.hasTurbo = true;
		System.out.println("Model is :" + " " + c2.model);
		System.out.println("Company Name is :" + " " + c2.companyName);
		System.out.println("Color is :" + " " + c2.Color);
		System.out.println("RPM is is :" + " " + c2.E.rpm);
		System.out.println("Poweris is :" + " " + c2.E.Power);
		System.out.println("Manufacturer is is :" + " " + c2.E.manufacturer);
		System.out.println("Turbo is is :" + " " + c2.E.hasTurbo);

	}

}
