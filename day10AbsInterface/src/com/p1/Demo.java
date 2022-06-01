package com.p1;

import java.util.Scanner;

public class Demo{
	
	public Hotel provideFood(int amount) {
		
		Hotel hotel;
		if(amount >= 1000) {
		      hotel =  new TajHotel();
		   return hotel;
		}
		else if(amount > 200 && amount < 1000) {
			 hotel =  new RoadSideHotel();
			return hotel;
		}
		
		return null;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter Amount");
		int enteredUserAmount = in.nextInt();
		
		Demo d1 = new Demo();
	Hotel hotel = d1.provideFood(enteredUserAmount); // calling and catching in Hotel 
		
		if(hotel != null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
			
			if(hotel instanceof TajHotel) {     // Preventing class cast exception
			TajHotel  taj	= (TajHotel)hotel;
			taj.welcomeDrink();
			
			}
			
		}else {
			System.out.println("Please enter Valid Amount");
		}
		
	
     

		
	}
}
