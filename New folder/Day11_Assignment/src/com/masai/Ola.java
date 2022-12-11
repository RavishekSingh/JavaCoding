package com.masai;

public class Ola {
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger <= 3) {
			Car c1 = new HatchBack();
			c1.setNumberOfPassenger(numberOfPassenger);
			c1.setNumberOfKms(numberOfKMs);
			return c1;
		}
		else {
			
			Car c2 = new Sedan();
			c2.setNumberOfPassenger(numberOfPassenger);
			c2.setNumberOfKms(numberOfKMs);
			
			return c2;
		}
		
	}
	public int calculateBill(Car car) {
		
		if(car instanceof Sedan) {
			int price = car.getNumberOfKms();
			int fare = ((Sedan)car).farePerKm;
			int total = price*fare;
			
			return total;
		}
		else {
			{
				int price = car.getNumberOfKms();
				int fare = ((HatchBack)car).farePerKm;
				int total = price*fare;
				
				return total;
				
			}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
