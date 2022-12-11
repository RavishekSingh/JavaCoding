package com.snow;

public class CheckWeather {
	
	boolean isSnowing = true;
	boolean isRaining = true;
	double temperature = 49.0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckWeather c1 = new CheckWeather();
		
		if(c1.isSnowing == true && c1.isRaining == true && c1.temperature<50.0) {
			
			System.out.println("Let's stay home.");
		}
		else {
			
			System.out.println("Let's go out!");
		}

	}

}
