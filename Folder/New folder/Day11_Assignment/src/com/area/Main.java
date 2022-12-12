package com.area;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a1 = new Area();
		
		int rArea =a1.rectangleArea(4, 6);
		System.out.println("Area of rectangle is "+rArea);
		
		int sArea = a1.squareArea(4);
		System.out.println("Area of square is "+sArea);
		
		int cArea = a1.circleArea(7);
		System.out.println("Area of circle is "+cArea);
	}

}
