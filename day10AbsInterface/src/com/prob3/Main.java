package com.prob3;

public class Main {

	public static void main(String[] args) {
		
		Shape s1 = new Area();
		
		
		System.out.println("Circle area is :" + s1.circleArea(4));
		System.out.println("Rectangle area is :" + s1.rectangleArea(3, 3));
        System.out.println("Square area is : " + s1.squareArea(4));
	}

}
