package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SalarybyId {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/db1";
		
		//Taking input from user for id
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Employee id to search ");
		  int enteredId = sc.nextInt();
		
		try {
		 Connection conn= DriverManager.getConnection(cs,"root","Shubham@12345");	
		 
		  Statement stmt = conn.createStatement();
		 // Need to write logic here in ps
		 //PreparedStatement ps = conn.prepareStatement("select * from employee where eid = ?");
		
		  ResultSet rs = stmt.executeQuery("select * from employee where eid = ?");
		
//		  	  .setInt(1, enteredId);
	
	
			
		// Printing and getting data.
			if(rs.next()) {
				
				int salary = rs.getInt("salary");
				
	
				System.out.println("Employee Salary = "+salary);
			
			}
			else {
				System.out.println("Id does not exist please enter correct id");
			}
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		 
		
		
		
	}

}
