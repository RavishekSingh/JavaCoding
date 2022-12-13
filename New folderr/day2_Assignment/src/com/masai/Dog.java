package com.masai;

public class Dog extends Animal {

	private String breed;

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String breed) {
		super();
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub

	}

	@Override
	void eat() {
		// TODO Auto-generated method stub

	}

	void play() {
		System.out.println("Dog is playing");
	}

}
