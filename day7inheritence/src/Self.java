package com.masai;

public class Self {
	
	// Has - A Relation 
	
	int x = 100;    // Non-static member we can't access directly. // Primitive variable
	
	A a1 = new A(); // Non-static variable // <-- user defined class type //<-- reference variable
	

	public static void main(String[] args) {
		System.out.println("Inside main method");
		

	    Self d1 = new Self();  // creating object of demo class
	    System.out.println(d1.x +" " + "Accessing non-static into main method");
	    System.out.println(d1.a1 + " Accessing A class object it will give address ");
	    
//	    if we not intialized the variable it will print some default variable
//	        int --> 0
	    // Reference variable = null
//	    since we can access A class  now need to call the function inside main method
	    
	    
//	   if the variable is holding null value after accessing it will throw err null pointer exception
	    
	    d1.a1.funA();  // Accessing member  
	    
	    
	    
	    
	    // Accessing another class inside main method or different class.
	    
	    A a1 = new A();  // Creating object of A class. // <-- This object is created locally
	    
	    a1.funA(); // <-- Accessing method of A class inside demo class main method.<-- Accessing memb.
	    
		System.out.println(d1);
	    System.out.println(a1); // It will give address 
	    
	    
	    System.out.println(a1.i); // It will give value of i of A class.
	
		
		
		
		
		
		
	}
	
	
}
