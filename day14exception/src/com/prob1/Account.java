package com.prob1;

public class Account {

	
	String accountNumber;
	
      double balance;
   
      
      void deposit( int amount) {
         balance = balance + amount;
    	  
      }
      
      // announcing
     double withdraw( int amount) throws InsufficientFundsException {
      	  
    	 if(amount > balance) {
    		 throw new InsufficientFundsException("Insufficient balance in your Account");
    	 }
    	 return balance - amount;
    	  
      }
   
     
     
    
   
}
