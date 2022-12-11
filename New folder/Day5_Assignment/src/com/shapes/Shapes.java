package com.shapes;

public class Shapes {

	public void area(Circle circle) {

		double area = 3.14 * circle.radius * circle.radius;

		System.out.println("Area of Circle is " + area);

	}

	public void area(Rectangle rectangle) {

		int area = rectangle.length * rectangle.breadth;

		System.out.println("Area of Rectangle is " + area);

	}

	public void area(Square square) {

		int area = square.side * square.side;

		System.out.println("Area of Square is " + area);

	}

	

}
