package com.probPractice;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		ThreadA t1=new ThreadA();
		Thread t=new Thread(t1); //passing Runnable object to the constructor of Thread class
		t.start();  // 2
		
	   
	      
	  Thread.sleep(8000);
		  
			for(int i=20;i<40;i++){
				
				System.out.println("inside main of ThreadA:"+i);
				
				}
	
	
		
	}

}
