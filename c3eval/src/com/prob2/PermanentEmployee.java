package com.prob2;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	public PermanentEmployee(int employeeId, String employeeName,double basicPay) {
		super(employeeId, employeeName);
	
		
		
	}

	@Override
	void calculateSalary() {
		
	 double	PF = basicPay * 0.12;
	 
		salary = basicPay * PF;
		
		
		
	}
	
	
	



}
