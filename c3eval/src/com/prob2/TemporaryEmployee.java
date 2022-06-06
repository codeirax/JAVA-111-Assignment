package com.prob2;

public class TemporaryEmployee extends Employee{

	
	private int hoursWorked;
	private int hourlyWages;
	
	
	public TemporaryEmployee(int employeeId, String employeeName,double hoursWorked,double hourlyWages) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void calculateSalary() {
	
		salary = hoursWorked * hourlyWages;
		
		
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyWages() {
		return hourlyWages;
	}

	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}

}
