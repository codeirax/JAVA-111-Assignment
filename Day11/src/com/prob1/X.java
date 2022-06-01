package com.prob1;

public interface X {

	  void abstractMethodx();
	  
	default void defaultMethodx() {
		System.out.println("I am inside default method X ");
	}
	
	public static void staticMethodx() {
		System.out.println("I am static method of X");
	}
	
}
