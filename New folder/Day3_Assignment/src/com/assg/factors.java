package com.assg;

public class factors {
	
      public static void printFactors(int x) {
		
		if(x>2 && x<100) {
			for(int i=1;i<=Math.floor(x/2);i++) {
				if(x%i==0) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println("Invalid number");
		}
		System.out.println(x);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printFactors(12);

	}

}
