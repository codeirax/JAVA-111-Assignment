package com.prob2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter How many Student object need to Create");
            int enteredObjNumber =  in.nextInt();
           
           for(int i = 0; i<enteredObjNumber; i++) {
        	   Student[] studObject = new Student[enteredObjNumber];
        	   
        	   System.out.println("Enter Student Name");
        	    String enteredName =  in.next();
        	    
        	    System.out.println("Enter Student roll");
        	    int enteredroll =  in.nextInt();
        	    
        	    System.out.println("Enter Student Address");
        	    String enteredAddress =  in.next();
        	    
        	    System.out.println("Enter Student Marks");
        	    int enteredmarks =  in.nextInt();
        	    
        	   studObject[i] = new Student(enteredName,enteredroll,enteredAddress,enteredmarks);
        	    int average   =   studObject[i].getMarks()/enteredObjNumber;
        	    
        	    System.out.println(studObject[i].getName());
    	       System.out.println(studObject[i].getRoll());
    	        System.out.println(studObject[i].getAddress());
    	        System.out.println(studObject[i].getMarks());
        	 
    	      System.out.println("Average of all Student marks is :"  + average);
           }
           
          
	}



}


class Student{
	
	
	int roll;
	String name;
	String address;
	int marks;
	
	
	
	public int getRoll() {
		return roll;
	}



//	public void setRoll(int roll) {
//		this.roll = roll;
//	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public Student(String enteredName, int enteredroll, String enteredAddress, int enteredmarks) {
		super();
	
		this.name = enteredName;
		this.roll = enteredroll;
		this.address = enteredAddress;
		this.marks = enteredmarks;
	}
	
	
	

}