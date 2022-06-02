package com.prob1;

public class Demo {

	public static void main(String[] args) {
		
		
	 ZImpl zimpl = new ZImpl();
	 
	 zimpl.abstractMethodx();
	 zimpl.abstractMethodY();
	 zimpl.defaultMethodx();
	 zimpl.defaultMethodY();

		X.staticMethodx();   // Calling with interface
		Y.staticMethodY();

	}

}
