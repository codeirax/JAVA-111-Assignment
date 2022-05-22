package com.day4;

public class Demo {
	public static void main(String[] args) {
//		Demo d1 = new Demo();
		new Demo();
	}

	
	public Demo() {
		this("hey I am string");
		System.out.println("This is zero argument");
		
		
	}
	
	public Demo(String s) {
		this(3);
		System.out.println("I am string argument constructor");
		
	}
  
	
	
	
  public Demo(int i) {
		this(33.33f);
		System.out.println("Hey i am int argument constructor");
	 }
	
  
   public Demo(float f) {
	   
	   System.out.println("This is float args constructor");
   }
   
   
   
	
}
