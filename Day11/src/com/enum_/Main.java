package com.enum_;

public class Main{
	
public void printCity(City city){
	
if(city != null){
 	
  System.out.println("our service is available ");

  city.message();

   System.out.println(city.numberofTowers);
}
  else
	  
System.out.println("invalid city");
}


public static void main(String[] args) {
	
Main m1=new Main();

m1.printCity(City.DELHI);
 
   }
}