package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LessThan80000 {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loding the driver main class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/db1";

		
		try {
		 Connection conn= DriverManager.getConnection(cs,"root","Shubham@12345");	
		 Statement st =conn.createStatement();
		
		 // Need to write logic here in ps

			
		 ResultSet rs = st.executeQuery("select * from employee where salary < 80000");
		
			
		// Printing and getting data.
			while(rs.next()) {
				int eid = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				System.out.println("Employee Id = "+eid);
				System.out.println("Employee Name = "+name);
				System.out.println("Employee Address = "+address);
				System.out.println("Employee Salary = "+salary);
				System.out.println("============================");
			}
			rs.close();
		
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	
		
	}

	}


