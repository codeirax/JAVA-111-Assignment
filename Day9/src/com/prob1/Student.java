package com.prob1;

import java.util.Scanner;

public class Student {
	
	
private int roll;
private String name;
private int marks;
private char grade;




public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public char getGrade() {
	return grade;
}

public void setGrade(char grade) {
	this.grade = grade;
}

public Student(int roll, String name, int marks, char grade) {

	this.roll = roll;
	this.name = name;
	this.marks = marks;
	this.grade = grade;
}

public Student() {
	
}

@Override
public String toString() {
	return "[Roll : " + getRoll() + ", Name :" + getName() + ", Marks :" + getMarks()+ ", Grade :" + getGrade() + ",]";
}
public void displayDetails() {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the roll no of Student");
      int enteredRoll = sc.nextInt();
      
      sc.nextInt();
      
      System.out.println("Enter Student Name ");
       String enteredName =  sc.next();
     
//     sc.nextLine();
     
     System.out.println("Enter Marks of the Student");
    int enterdMarks =  sc.nextInt();
    
    char calCulatedGrade = calculateGrade();
    // Now we need to initialize the data 
    
    setRoll(enteredRoll);
    setName(enteredName);
    setMarks(enterdMarks);
    setGrade(calCulatedGrade);
  
   



	
}

private char calculateGrade(){  // Grade returning
	
	char grade;
 if(marks >= 500) {
	 grade = 'A';
 }
  if(marks < 500 && marks >= 400) {
	  grade = 'B';
  }
  else {
	  grade = 'C';
  }
 return grade;
  
  
}

}



