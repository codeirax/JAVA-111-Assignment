package com.prob1;

import java.util.Scanner;

class Employee {
	
	private int employeeId;
	private String employeename;
	private double salary;
	private double netSalary;
	
		
   Employee(){
	
   }
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	
	public String getEmployeename() {
		return employeename;
	}
	
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getNetSalary() {
		return netSalary;
	}


	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	
	 public void calculateNetSalary(int pfpercentage) {
		netSalary = salary - salary*pfpercentage/100;
	 }
	 

	 
	 
	public Employee(int employeeId, String employeename, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.salary = salary;
	}

}



 
 public class Main{
	
public static Employee getEmployeeDetails() {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Employee Id");
		 int enteredId = sc.nextInt();
		 
		 System.out.println("Enter Employee Name");
		 String enteredName = sc.nextLine();
		 sc.nextLine();
		 
		 System.out.println("Enter Your salary");
		 int enteredSalary = sc.nextInt();
		 
//		 creating object with the help of constructor
		 
		  Employee Employeedetails = new Employee(enteredId, enteredName, enteredSalary);
		      return Employeedetails;  // returning object here
	 }
	 
	 
	 public static int getPFPercentage() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter PF pecent");
			int pfp = sc.nextInt();
			return pfp;
		}
	 
	 
	 
	 
	 

	 public static void main(String[] args) {
		
		 
		Employee e1 = Main.getEmployeeDetails();   // calling method to enter details
		
		int pfpercentage = Main.getPFPercentage(); //  giving pf percent value here
		
	       e1.calculateNetSalary(pfpercentage);
	       
	       System.out.println("*********************");
	       
	       
	       System.out.println("Id :" +  e1.getEmployeeId());
	       System.out.println("Name :" +  e1.getEmployeename());
	       System.out.println("Salary :" +  e1.getSalary());
	       
	       System.out.println("Net Salary:" +  e1.getNetSalary());
	       
	}
	 	 
 }
