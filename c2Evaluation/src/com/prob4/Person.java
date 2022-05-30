package com.prob4;

public class Person {
String name;
	String gender;
	
	
}

class Address extends Person{
	
	String city;
	String state;
	String pinCode;
	
	
}

class Instructor extends Person{
	int instructorId;
	int salary;
	
	
//	public Instructor(int instructorId, int salary) {
////		super();
//		this.instructorId = instructorId;
//		this.salary = salary;
//	}


	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + "]";
	}
	
	
	
}

class Student extends Person{
	int studentId;

	String courseEnrolled;
	int courseFee;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ "]";
	}

//	public Student(int studentId, String courseEnrolled, int courseFee) {
////		super();
//		this.studentId = studentId;
//		this.courseEnrolled = courseEnrolled;
//		this.courseFee = courseFee;
//	}
//	
	
	
}

class Main{
	
	public static Person generatePerson(Person person) {
		
		return person;
	}
	
	public static void main(String[] args) {
		
		
		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Instructor());
		System.out.println(newStudent);
		System.out.println(newTeacher);
		
	}
}


