package com.prob2;

import java.util.Scanner;

public abstract class Parent {
	
 final int number;       // we need to assign final variable
  
  public Parent(int i) {   // we need parent constructor for assigning or creating.
	  number = i;
  }
  
  
	public int getNumber() {
	return this.number;
}

 public abstract void method1();
	
 final	void method2() {
		
	 System.out.println("This is method 2 of parent");
		
	}
 
	void method3() {
		
		System.out.println("This is method 3 of parent");
		
	}
}

final class Child extends Parent{
	
	
	@Override
  public void method1() {
	 // printing number here
		System.out.println(getNumber());
	 System.out.println("This is overriden method 1 of Child ");
		
	}
	 
	void method4() {
		System.out.println("This is method 4 of child");
	}
	
	public Child(int num) {  //  child argument passing to parent class in order to assign.
		super(num);
	}
	
}




class Main{
	public static void main(String[] args) {
		
	
		
	    Scanner in = new Scanner(System.in);
	    
		System.out.println("Enter number between 1 to 10");
		int enteredNumberByUser = in.nextInt();
		
       if(enteredNumberByUser >=1 && enteredNumberByUser <= 10) {
    	  
    		Parent p1 = new Child(enteredNumberByUser);
    		p1.method1();
    		p1.method2();
    		p1.method3();
    	   
       }else {
    	   System.out.println("Invalid Number");
       }
		
      
		
	}
}




