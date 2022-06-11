package com.prob1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class Demo {
	
	LocalDate dateOfBirthValidation(String Userdob) throws InvalidDateFormat {
	
		
		// validation handling 
		
		try {
			
			LocalDate dob = LocalDate.parse(Userdob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));   // userDob --> formating and parsing
			
			return dob;
		}
		
		catch(DateTimeParseException dtpe){
			
			throw new InvalidDateFormat();
		}
			


	
		
	}
	
public static void main(String[] args) {
	
 Demo d1 = new Demo();

    
     
     	Scanner in = new Scanner(System.in);
	 System.out.println("Enter the date of birth of the user in dd/MM/yyyy format : ");
	 
	 String dob = in.next();
      
	 try {
		
	    LocalDate userDob =	d1.dateOfBirthValidation(dob);   // userDob
		LocalDate currDate =  LocalDate.now();               // currDate
		 
		if(currDate.isBefore(userDob)) {
			System.out.println("Date should not be in future");
		}else {
			System.out.println("User age is : " + ChronoUnit.YEARS.between(userDob, currDate)); //finding age here
		}
		
		 
	} catch (InvalidDateFormat idf) {
		System.out.println("Invalid date formate");
	}
	 
	 
	 
	 
      
 }
}







