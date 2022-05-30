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
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
	
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
		Car car;
		if(numberOfPassenger<= 3) {
			car = new HatchBack();
		}else {
			car =new Sedan();
		}
		car.setNumberOfPassenger(numberOfPassenger);
		car.setNumberOfKms(numberOfKMs);
		return car;
	}

	public int calculateBill(Car car) {
		int totalFare =  car.getNumberOfKms()* car.getNumberOfKms();
		return totalFare;
	}
}



