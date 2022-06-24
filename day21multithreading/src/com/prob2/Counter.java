package com.prob2;

public class Counter implements Runnable{
  private int c = 0;
  
  public void increment() {
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 c++;
  }
  
  public void decrement() {
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   c--;
  }
  
  public int getValue()   
  {  
  return c;  
  }  
 
	@Override
	public void run() {
	synchronized (this) {
		
		this.increment();	 // increment method.
		System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue()); 
		
		this.decrement();   // decrement method
		System.out.println("Value for Thread after decrement " + Thread.currentThread().getName() + " " + this.getValue());   
		
	}

	}

}
