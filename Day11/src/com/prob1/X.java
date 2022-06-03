package com.prob1;

public interface X {

	  void abstractMethod();
	  
	default void defaultMethod() {
		System.out.println("I am inside default method X ");
	}
	
	public static void staticMethodx() {
		System.out.println("I am static method of X");
	}
	
}
