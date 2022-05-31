package com.prob3;


public class Ola{
	

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
//		Car car;
		if(numberOfPassenger<= 3) {
			
			HatchBack hatchback = new HatchBack();
			hatchback.setNumberOfPassenger(numberOfPassenger);
			hatchback.setNumberOfKms(numberOfKMs);
			return hatchback;
		}else {
			Sedan sedan = new Sedan();
			sedan.setNumberOfKms(numberOfKMs);
			sedan.setNumberOfPassenger(numberOfPassenger);
			return sedan;
		}
		
			
		
	}

	
	
	public int calculateBill(Car car) {
		
		if(car instanceof HatchBack) {
			
			HatchBack hatchBack =  (HatchBack)car;  // down casting
//			HatchBack hatchBack =  new HatchBack(); 
			
			int totalFare =  hatchBack.getNumberOfKms()* hatchBack.getNumberOfKms();
		   return totalFare;
		}
		
		else
		{
			
			Sedan sedan =  (Sedan)car;   //down casting
//			Sedan sedan =  new Sedan(); 
			int totalFare = sedan.getNumberOfKms()*sedan.getNumberOfKms();
			return totalFare;
		}
		
	}
}
