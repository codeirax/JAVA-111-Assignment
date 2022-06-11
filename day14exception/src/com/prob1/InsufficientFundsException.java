package com.prob1;

public class InsufficientFundsException extends Exception {
	

	public InsufficientFundsException(String message) {  // overloaded constructor
		super(message);
	}
	
	public InsufficientFundsException() {
		
	}
}
