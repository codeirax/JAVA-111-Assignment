package com.prob1;

public class AccountDemo {

	public static void main(String[] args) {
	
		Account a1 = new Account();
        a1.accountNumber = "12345";
		
      
		a1.deposit(4000);
		
		
//		a1.withdraw(6000);
		
//		handling part
	

		try {
		
			double balance = a1.withdraw(1000);
			System.out.println("Balance after withdraw is : " + balance);
	
		} catch (InsufficientFundsException ie) {
			System.out.println(ie.getMessage());
		
		}
		
		
	
		
		
		
		

	}

}
