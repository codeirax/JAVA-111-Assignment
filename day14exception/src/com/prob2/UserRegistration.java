package com.prob2;

import java.util.Scanner;

public class UserRegistration {

	
	void registerUser(String username,String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		}else{
   InvalidCountryException ece = new InvalidCountryException("User Outside India cannot be registered");
		throw ece;
		}
	}
	
	public static void main(String[] args) {
	
     UserRegistration u1 = new UserRegistration();
     
     // handling exception here
     
     try {
    	 
    	 try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Your Name :");
			String name =  in.next();
			
			System.out.println("Enter your country Name");
      String country =	in.next();
      
      
      u1.registerUser(name,country);
		}
		
	} catch (InvalidCountryException ece) {
		
    System.out.println(ece.getMessage());
	}
     
     
     
	}

}
