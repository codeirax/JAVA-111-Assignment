package com.concept;

class Student
{
public int roll_no;
public String name;

// passing  Assigning and printing -> PAP ->  Rule for any constructor with method just apply. 

// Flow of the PAP - > 3 2 1

Student(int roll_no, String name)  // 2 It would initialise the args here as a value
     {
   this.roll_no = roll_no;         // all the value has assigned
   this.name = name;
  }



public void printDetails(){
System.out.println("Roll is :"+roll_no+" Name is :"+name); // 3. Printing the value
}


}

class Main{
	
	public static void main(String[] args){
		// When you are creating any array you always need to initialize the size 
	Student[] students = new Student[3];
	
	students[0] = new Student(10,"Ram");     // 1. Passing Argument 
	students[1] = new Student(20,"Ramesh");
	students[2] = new Student(40,"Amit");
	
	for(Student student:students){
	      student.printDetails();
	   }
	}
	
	
	}
