package com.masai;

public class Demo {
	
	public int fun(String s) {
		return Integer.parseInt(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			X x = new Demo()::fun;
			System.out.println(x.convetStringToNumber("5d0"));
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}

}
