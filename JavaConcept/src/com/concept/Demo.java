package com.concept;

public class Demo {
  public static void main(String[] args) {
	
	//	1. Can we push some items in array ?
	 int[] marks = new int[4]; // by defaut it will give zero. // new keyword
//	 dataType name = new dataType sizeOfArrayWithCurlyBracket.
	 
	 
//	 Note: Array is mutable that's why I am just updating 
	 int[] marks1 = {1,2,3,4};  // by curly bracket 
	 System.out.println(marks1[0]);	//1
	 
	 
//	 String name = "abcd";
//	 
//	 System.out.println(name);
//	 
//	 name = "efgh";
//	 
//	 System.out.println(name);
//	 
	 
	 
	 marks1[0] = 10;
	 marks1[1] = 20;
	 marks1[2] = 30;
	 marks1[3] = 40;
//	 marks1[4] = 50;
	 
	  System.out.println(marks1[0]); //10	
	 	  
	 	 for(int item:marks1) {   // for Each loop
		 System.out.println(item);  // 
	 }
	 



	
	 
	 
	 
	 
}
}
