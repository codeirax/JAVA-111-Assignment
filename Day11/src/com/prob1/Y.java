package com.prob1;

public interface Y {
	
	  void abstractMethodY();
	  
		default void defaultMethod() {
			System.out.println("I am default method of Y");
			
		}
		
	     static void staticMethodY() {
			System.out.println("I am static method of Y");
		}

}
