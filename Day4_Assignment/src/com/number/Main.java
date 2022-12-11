package com.number;

public class Main {

	 void res(int n) {
		  if(n<0) {
				System.out.println("Error");
			}
		 
	    else if(n%2!=0) {
			System.out.println(n);
		}
		  
		else if(n%2==0) {
			while(n%10!=0) {
				n=n+1;
			}
			System.out.println(n);
		}
		
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main n1= new Main();
		n1.res(-44);

	}

}
