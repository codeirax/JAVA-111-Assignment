package com.prob1;

public interface X {
  
	void walk();
	
    default void fly() {
    	System.out.println("I can fly  in Xintr");
    }
    
    public static void run() {
    	System.out.println("I can run in Xintr");
    }
}  
