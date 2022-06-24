package com.prob2;

public class RaceConditionDemo {

	public static void main(String[] args) {
		
		Counter c = new Counter();
		

		
		Thread t1 = new Thread(c,"ram");  
		Thread t2 = new Thread(c,"shyam");
		Thread t3 = new Thread(c,"mohan");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
