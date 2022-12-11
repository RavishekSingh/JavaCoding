package com.masai;

public class DShapes {

	private Shape s;
	
	public void getShape(Shape s) {
		this.s=s;
	}
	
	
	
	public void draw(Shape s) {
		s.drawing();
	}
}
