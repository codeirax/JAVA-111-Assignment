//package com.jdbc;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class InsertEmpDetails {
//   public static void main(String[] args) {
//	
//	   
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("problem with loding the driver main class");
//		}
//		
//		String cs = "jdbc:mysql://localhost:3306/db1";
//         
////		Taking input from the user
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please Enter Employee id");
//	  int enteredid = sc.nextInt();
//	  
//	  System.out.println("Please enter Employee Name");
//	  String enteredName = sc.next();
//	  
//	  System.out.println("Please enter Employee Salary");
//	    int enteredSalary = sc.nextInt();
//    		
//		try( Connection conn= DriverManager.getConnection(cs,"root","Shubham@12345")){	
//		
//			
//			Statement st =conn.createStatement();
//	
//		 // Need to write logic here in ps
//		// PreparedStatement ps = conn.prepareStatement("insert into employee(eid,name,salary) values(?,?,?)");
//		 
////		  st.executeUpdate("insert into employee(eid,name,salary) values(?,?,?)");
//		
//
//
//		//		 binding here
//		 ps.setInt(1, enteredid);
//		 ps.setString(2, enteredName);
//         ps.setInt(3, enteredSalary);	
//	
////		ResultSet rs = ps.executeQuery();
//         int x = ps.executeUpdate();
//			
//		  if(x > 0) {
//			  System.out.println(x + " Inserted into employee table");
//		  }else {
//			  System.out.println("Not Inserted into employee table");
//		  }
//				
//			
//		}catch(SQLException ex) {
//			ex.printStackTrace();
//		}
//		 
//		
//			
//		
//	  
//	   
//}
//}