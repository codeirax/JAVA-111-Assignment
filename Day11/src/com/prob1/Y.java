package com.prob1;

public interface Y {
  
void dance();
	
    default void sing() {
    	System.out.println("I can Sing  in Yintr");
    }
    
    public static void ride() {
    	System.out.println("I can ride in Yintr");
    }
}
