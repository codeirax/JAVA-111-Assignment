package com.day4;

public class Demo1
{
//instance variable 
int x = 100;
char ch = 'r';
int number = 333;
String name = "Shivaay";

void fun1(){  // <-Method
	
//local variable
	int x = 500;
	System.out.println("inside fun1() of Demo");
	System.out.println(this); //Demo@232323 current class obj // returning object
	System.out.println(this.x); // 100   // accessing x through object of class Demo e.g -> this
	System.out.println(x); //500  // local variable x not by object
	
	Demo1.checkThis();
	}

static void checkThis() {
	
	System.out.println("You are in checkthis method");
	
}


static int num = 4;

     void funName(int s) {
    	
       // We can only access this in non-static method.
    	 System.out.println("Argument passing " + s);
    	 System.out.println("Inside funName");
    	 System.out.println(this.x);// 100    // for accessing instance var use this
    	 System.out.println(Demo1.num ); // 4 <-- accessing static variable use ClassName.varName
    	 
//    	 	System.out.print(this.checkThis()); 
     }
     
     
     
 public static void custMethod() {
    	 System.out.println("I am custom static method");
    	 
//    	System.out.println(this.name); // compiler error 
    	 
   
    	 
     }

 
 
 public static void main(String[] args)
 {
 Demo1 d1 = new Demo1();
 System.out.println(d1); // Demo@232323
 d1.fun1();

 //System.out.println(this); //Compilation Error  
 d1.funName(5);  // Method calling by creating an object.


 }


 
	
	
	}


//1. We can't access this in static method.
//2. this keyword return object easily in only non-static method.
//3. By this keyword we can access non-static variable of current class.
//4. We can't access executable statement in class directly.
//5. We can only use this keyword in only in constructor and method.
		
		



