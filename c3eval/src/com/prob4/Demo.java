package com.prob4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	
	 boolean validate(String username,String password,String mobile,String email) {
		 
		 
           if(!Pattern.matches("[a-z]{3,8}", username)) {
        	   return false;
           }
		  
		  if(!Pattern.matches("[a-z]{3,8}", password)){
			 return false;
		  }
		  
		  if(!Pattern.matches("[56789]{1}[0-9]{9}", mobile)) {
			  return false;
		  }
		  if(!Pattern.matches("[a-ZA-20-9] + [@]{1}+[a-zA-Z.]", email)) {
			  return false;
		  }
			   else {
			  return true;
		  }
		  
		  
	  }

	 
	 
	public static void main(String[] args) {
		
	Demo d = new Demo();
	
	
	
			
	
		Scanner in = new Scanner(System.in);
		
	 System.out.println("Enter Your userName");
	 String userName = 	in.nextLine();
	 
	 System.out.println("Enter Your password");
	 String password = in.nextLine();
	 
	 System.out.println("Enter Your mobile Number");
	 	 String mobile  = in.nextLine();

	 
	  System.out.println("Enter Your email");
	  String email =  in.nextLine();
	 
	  
	  
	  try {
		  
	 
	  
	  if(  d.validate(userName, password, mobile, email)) {
		   
		   Customer c = new Customer();
		   
		   c.setUsername(userName);
		   c.setPassword(password);
		   c.setMobileNumber(mobile);
		   c.setEmail(email);
		   
		   System.out.println("Username :" + c.getUsername());
		   System.out.println("Password :" + c.getPassword());
		   System.out.println("Mobile :" + c.getMobileNumber());
		   System.out.println("Email :" + c.getEmail());
	   }else {
		   System.out.println("Invalid");
	   }
	       
	  }
	
	 catch(Exception e){
		 	 e.getMessage();
	 }
		 

	}

}
