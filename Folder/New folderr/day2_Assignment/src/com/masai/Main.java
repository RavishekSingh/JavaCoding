package com.masai;

public class Main {

	public static void main(String[] args) {

		Animal dog = new Dog();

		Animal cat = new Cat();

//		Dog dg = new Dog();
//		Cat ct = new Cat();

		Dog dg=(Dog)dog;
		dog.eat();
		dog.makeNoise();
		dog.sleep();
		dg.play();

		Cat ct=(Cat)cat;
		cat.eat();
		cat.makeNoise();
		cat.sleep();
		ct.jump();
	}

}
