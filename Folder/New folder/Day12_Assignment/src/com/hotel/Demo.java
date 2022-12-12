package com.hotel;

import java.util.Scanner;

public class Demo {
	
	public Hotel provideFood(int amount) {
		
		Hotel h1 =null;
		if(amount>1000) {
			 h1 = new TajHotel();
		}
		else if(amount>200 || amount<=1000) {
			 h1 =new RoadSideHotel();
		}
		return h1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		int amt = sc.nextInt();
		
		Demo d1 = new Demo();
		Hotel h = d1.provideFood(amt);
		
		if(h!=null) {
			
			h.chickenBiryani();
			h.masalaDosa();
			
			if(h instanceof TajHotel) {
				TajHotel t =(TajHotel)h;
				t.welcomeDrink();
			}
			
		}
		else {
			System.out.println("Enter a valid amount");
		}

	}

}
