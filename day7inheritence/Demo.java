package com.masai;

public class Demo {
	public static void main(String[] args) {
		new Demo();
	}

	
 public Demo() {
	 this("String");
	System.out.println("Inside zero argument");
		
	}


public Demo(String s) {
		this(2.13f);
	System.out.println("Inside String para");
		
	}


public Demo(float f) {	
	System.out.println("Inside float para");
	}



}
