package com.prob1;

public class Main {

	public static void main(String[] args) {
		
	 Mythread mt = new Mythread();
	 Thread t1 = new Thread(mt);   
	 
	 t1.start();   //  2
	  
    try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 int result = mt.prod;
	 
	System.out.println("Product is " + result);
		 
		
		
	}

}
