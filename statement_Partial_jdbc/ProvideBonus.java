package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.Statement;

public class ProvideBonus {

	public static void main(String[] args) {
	
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/db1";

		
		try {
		 Connection conn= DriverManager.getConnection(cs,"root","Shubham@12345");	
		 
		  Statement st = conn.createStatement();
		 // Need to write logic here in ps
		// PreparedStatement ps = conn.prepareStatement("update employee set salary = salary + 500");
	
	   int rs = st.executeUpdate("update employee set salary = salary + 500");
//		ResultSet rs = ps.executeQuery();
//		int rs = ps.executeUpdate();
		
			
		if(rs > 0) {
			System.out.println( rs +" Updated");
		}else {
			System.out.println("Not Updated");
		}

		
		}catch(SQLException ex) {
			ex.printStackTrace();
			
		}
		 
		
		
		
		
	}

}
