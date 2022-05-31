package com.prob4;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("How many Student object you want to create");
  int enteredObjQuery = in.nextInt();
 in.nextLine();
 
  Student[] stud = new Student[enteredObjQuery];
  
  int total = 0;
  for(int i = 0; i<enteredObjQuery; i++) {
	  
	  System.out.println("Enter roll number of Student "  + (i+1));
	  int enteredRoll = in.nextInt();
	  in.nextLine();
	  
	  System.out.println("Enter name of Student " + (i+1));
	  String enteredName = in.nextLine();
	  
	  System.out.println("Enter Marks of Student " + (i+1));
	  int enteredMarks = in.nextInt();
	  in.nextLine();
	  
	  System.out.println("Enter Address of Student " + (i+1));
	  String enteredAddress = in.nextLine();
	  
	  
	  Student details = new Student();
	  
	  details.setRoll(enteredRoll);
	  details.setName(enteredName);
	  details.setMarks(enteredRoll);
	  details.setAddress(enteredAddress);

	
	  total += enteredMarks;
	  
	  stud[i] = details;
	
  }
  
  System.out.println("******");
  
  // Printing part
  
  System.out.println("Average is :" + total/enteredObjQuery);
  
  
  
  for(int i = 0; i<stud.length; i++ ) {
	  
	  System.out.println("Roll no. of the student " + (i + 1) + " is " + stud[i].getRoll());
		System.out.println("Name of the student " + (i + 1) + " is " + stud[i].getName());
		System.out.println("Address of the student " + (i + 1) + " is " + stud[i].getAddress());
		System.out.println("Marks of the student " + (i + 1) + " is " + stud[i].getMarks());
		System.out.println("-----------------------------------------");
  }
}
}
