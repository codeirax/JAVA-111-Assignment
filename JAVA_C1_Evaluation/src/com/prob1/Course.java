package com.prob1;

import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	Course(int i, String n,int f){
		this.courseId = i;
		this.courseName = n;
		this.courseFee = f;
	}
	
	void displayCourseDetails() {
		System.out.println("Course ID is " + courseId);
		System.out.println("Course Name is " + courseName);
		System.out.println("Course Fee is " + courseFee);
	}
	
	static void authenticate(String username, String password) {
		if(username.equals("Admin") && password.equals("1234")) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the course id : ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("Enter the course name : ");
			String name = input.nextLine();
			System.out.print("Enter the course fee : ");
			int fee = input.nextInt();
			Course course1 = new Course(id, name, fee);
			System.out.println("--------------------------");
			course1.displayCourseDetails();
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		authenticate("Admin", "1234");
		System.out.println("--------------------------");
		authenticate("Shubham","21345");
	}
}