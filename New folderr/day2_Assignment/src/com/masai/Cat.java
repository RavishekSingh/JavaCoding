package com.masai;

public class Cat extends Animal {

	private String nickName;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String nickName) {
		super();
		this.nickName = nickName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub

	}

	@Override
	void eat() {
		// TODO Auto-generated method stub

	}

	void jump() {
		System.out.println("Cat is jumpng");
	}
}
