package com.animal;

public class Tiger extends Animal {

	@Override
	void eat () {
		 System.out.println("Tiger is eating !!");
	 }
	public Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Animal a=new Tiger();
			a.eat();
		} catch (AnimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
