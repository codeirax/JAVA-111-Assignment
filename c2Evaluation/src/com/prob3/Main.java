package com.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("For how many passenger ");
	  int enteredPassenger =	scanner.nextInt();
		
	  System.out.println("How many km to you want to go");
	  int enteredKms =	scanner.nextInt();
	  
	  
		Ola myOla = new Ola();
		
		Car myCar = myOla.bookCar(enteredPassenger, enteredKms);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);
	}

}

class Car{
	
	int numberOfPassenger;
	int numberOfKms;
	
	
}

class Sedan extends Car{
	final int farePerKm = 20;

	public int getFarePerKm() {
		return farePerKm;
	}
	
	
	
	
}


class HatchBack extends Car{
	final int farePerKm = 15;

	public int getFarePerKm() {
		return farePerKm;
	}
	
}



 class Ola{
	
	

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<= 3) {
			return new HatchBack();
		}else {
			return new Sedan();
		}
		
	}

	public int calculateBill(Car car) {
		int totalFare =  numberOfKMs * farePerKm;
	}
}



