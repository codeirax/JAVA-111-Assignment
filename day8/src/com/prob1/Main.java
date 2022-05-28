package com.prob1;

public class Main {
	public static void main(String[] args) {
		Bird b1 = new Parrot();    // super reference child
		b1.fly();
		
	  ((Parrot) b1).sing();    // down casting here.
	  
	  
	}

}

class Bird{
	
	public void fly(){
		System.out.println("Bird is flying");
		}
	
}

class Parrot extends Bird{
	@Override
	
	public void fly(){
		System.out.println("I am  flying");
		}
	
	public void sing(){
		System.out.println("I am Singing");
		}
	
}