package com.prob3;

public class Area  extends Shape{

	private static final double PI = 3.14;

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		return length * breadth;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return 4*side*side;
	}

	@Override
	public int circleArea(int radius) {
		// TODO Auto-generated method stub
		return (int) (PI*radius*radius);
	}

}
