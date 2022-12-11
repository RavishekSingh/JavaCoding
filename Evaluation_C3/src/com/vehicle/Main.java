package com.vehicle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuelCar f1 = new FuelCar();
		f1.run();
		f1.service();
		
		ElectricCar e1 = new ElectricCar();
		e1.run();
		e1.service();

	}

}
