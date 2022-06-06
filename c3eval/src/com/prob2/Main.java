package com.prob2;

public class Main {

	public static void main(String[] args) {
		
		Loan loan =new Loan();
		
		PermanentEmployee p = new PermanentEmployee(32, "Rahul", 5320);
		System.out.println(loan.calculateLoanAmount(p));
		

	}

}
