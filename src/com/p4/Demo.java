package com.p4;

import java.util.Scanner;

class Bank{
	String branchName;
	String IfscCode;
	
	
	
	
void displayDetails(){
	System.out.println("Branch Name : "+ branchName);	
	System.out.println("Ifsc Code : " + IfscCode );
	}

	
}

class AxisBank extends Bank{
	double rateOfInterest;
	
	

	@Override
	void displayDetails(){
		System.out.println("Branch Name : "+ branchName);	
		System.out.println("Ifsc Code : " + IfscCode );
		System.out.println("Rate of Interest : " + rateOfInterest);
		}
	
	


	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}

class ICICIBank extends Bank{
	double rateOfInterest;
	@Override
	void displayDetails(){
		System.out.println();
		System.out.println("Branch Name : "+ branchName);	
		System.out.println("Ifsc Code : " + IfscCode );
		System.out.println("Rate of Interest : " + rateOfInterest);
		}
	
	
	
	
}




class Demo{
	
	public static Bank getBank(String bank) {
		
	  Scanner in = new Scanner(System.in);
	  if(bank.equals("axis") ){
		
		 
		  
	 
		     AxisBank b1 = new AxisBank();   // return obj of axis
	  
	    
	    System.out.println("Enter Branch Name");
	    b1.branchName =in.next();
	    
	    System.out.println("Enter Ifsc Code");
	    b1.IfscCode = in.next();
	    
	    System.out.println("Enter rate of Interest(%)");
	        b1.rateOfInterest= in.nextDouble();
	        
	          System.out.println();
	          System.out.println("****************");
	    
	      return b1;
	  }
	  
	  if(bank.equals("icici")) {
		  
		  
		  
		ICICIBank b1 = new ICICIBank();  // we can't access non-overridden member
		   
	    System.out.println("Enter Branch Name");
	    b1.branchName =in.next();
	    
	    System.out.println("Enter Ifsc Code");
	    b1.IfscCode = in.next();
	    
	    System.out.println("Enter rate of Interest(%)");
	   b1.rateOfInterest= in.nextDouble();
	   
	   
	   System.out.println();
	   System.out.println("****************");
		return b1;
		
	  }
	  else {
		  return null;
	  }
	
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Your Bank Name");
			String bankName = in.next();
			
			Bank UserAccount =  getBank(bankName);   // it will return object
			UserAccount.displayDetails();
			
			System.out.println();
			
			
			if(UserAccount instanceof AxisBank) {
				System.out.println("For Special axis bank Users");
				AxisBank cc1 = (AxisBank) UserAccount;   //Down Casting 
				cc1.getCreditCard();
			}
		}
		
		
		
		
	}
}
