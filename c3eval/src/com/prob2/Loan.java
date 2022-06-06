package com.prob2;

public class Loan {

	
	public double calculateLoanAmount(Employee employeeObj) {
	
		if(employeeObj instanceof TemporaryEmployee) {
			
			TemporaryEmployee t = new TemporaryEmployee(121, "Nitish", 4, 120);
		
			double loanamt = t.getSalary() * 10/100;
			return loanamt;
		}else if(employeeObj instanceof PermanentEmployee) {
			PermanentEmployee p = new PermanentEmployee(301, "Raju", 9780);
			
			double loanamt = p.getSalary() * 10/100;
			return loanamt;
		}else {
			return 0;
		}
	}
}
