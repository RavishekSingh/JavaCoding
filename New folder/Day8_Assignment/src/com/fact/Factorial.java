package com.fact;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length == 1) {
			int fact=1;
			
			int n=Integer.parseInt(args[0]);
			while(n>=1) {
				fact = fact*n;
				n--;
			}
			System.out.println(fact);
		}
		
		else if(args.length == 2) {
			int fact=1;
			
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			int num=Math.abs(n1-n2);
			
			while(num>=1) {
				fact=fact*num;
				num--;
			}
			System.out.println(fact);
		}
		
		else {
			System.out.println("Error");
		}

	}

}
