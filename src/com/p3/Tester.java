package com.p3;

class Animal {
	   String name;    
	   
	   Animal(String name) {   // constructor
	      this.name = name;
	   } 
	   
	   public void move() {
	      System.out.println("Animals can move");   // common targeting
	   }
	   
	   public void show() {
	      System.out.println(name);     // common targeting
	   }
	}




	class Dog extends Animal {

	    Dog() {     // <-- No args constructor
	    	
	           
	      this("Test");  //Using this to call current class constructor
	   } 
	    
	   Dog(String name) {     // string argument constructor  // whatever name will set here it will reflect to parent
	     
	      super(name);   //Using super to invoke parent constructor
	   }
	   
	   public void move() {
	      
	      super.move(); // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }  
	}
	
	
	
	
	
	
	public class Tester {
	   public static void main(String args[]) {
	      // Animal reference but Dog object
	      Animal b = new Dog("Tiger"); 
	      b.show();
	      // runs the method in Dog class
	      b.move(); 
	   }
	}