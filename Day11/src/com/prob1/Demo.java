package com.prob1;

public class Demo {

	public static void main(String[] args) {
		
		
	 ZImpl zimpl = new ZImpl();
	 
	 zimpl.abstractMethodx();
	 zimpl.abstractMethodY();
	 zimpl.defaultMethod();
	 zimpl.defaultMethod();

		X.staticMethod();   // Calling with interface
		Y.staticMethod();

	}

}
