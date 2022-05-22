package com.day4;

//Calling a constructor explicitly:


//A constructor will be called automatically whenever we create object of a class.
//We can call a constructor of a class explicitly also, but that call must be :

//1. From the another constructor of the same class (using 'this' keyword)
//2. From the constructor of its child class. (using 'super' keyword)


//constructor Argument.



	public class ConstructorCall
	{
		
		
		
	  public ConstructorCall(){  // zero argument constructor.
	       this(10);
	       
	   System.out.println("inside zero argument constructor Demo()");
	}
	
	
		public ConstructorCall(int x){   // one argument constructor
		     this(100, 200);
		   System.out.println("inside one argument constructor Demo(int x)");
		}
		
		
	public ConstructorCall(int x,int y){  // two argument constructor
	   this("Hello");
	
	   System.out.println("inside two argument constructor Demo(int x,int y)");
	}
	
	
	public ConstructorCall(String s){
	this(33.33);
	//this(); //it will become recursive call
	System.out.println("inside one(String) argument constructor Demo(String s)");
	
	}
	
	
	public ConstructorCall(double d) {
	  
		System.out.println("I am inside double type argument");
		
	}
	
	
 
	public static void main(String[] args){
		
		
	   ConstructorCall d1 = new ConstructorCall();  // <-- A constructor will be called automatically whenever we create object of a class.
	
	
	   
		
	  
	}
	
	
	
	
	}
	
	

	// 1. We can't go outside of the class.
	// 2. Green color is constructor and also method color is green in sts.
	// 3. Constructor -> method having variable name as className
	// 4. Constructor --> about className only.
	// 5. Method always need return type.
	
	// 5. We can use constructor in only in class (doubt).
	
	// 6. this keyword will easily call the different kind of parameterized constructor.
	
	// 7 . Constructor call must be the first call.
	// 8. A constructor will be called automatically whenever we create object of a class.
	// 9. Method can't call itself automatically but constructor can.
	
	//We can use constructor inside class only.
	