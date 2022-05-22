package com.day_4NIT;

public class Student {

    int roll;	String name;	String address;	String collegeName;
	

public Student(int roll, String name, String address) {  // 3 args
		
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = "NIT";  // Catching college
	} 

	 



	public Student(int roll, String name, String address, String collegeName) {  // non-nitian 4 args
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collegeName = collegeName;
	}
	
	
	
	public static Student getStudent(boolean isFromNIT) {
		if(isFromNIT == true) {
			Student s1 = new Student(1,"Shubham","Siwan");  // Creating object
			return s1;  // Returning object
		 }
		else {
			Student s1 = new Student(2,"Shivay","Bihar","Masai");
			return s1;  // Returning object
		}
	}


	
	
	

	 

	public static void main(String[] args) {
		
            Student s1 =getStudent(false);
            System.out.println(s1.collegeName);  // Masai
            
            
            
            Student s2 = getStudent(true);
           System.out.println(s2.collegeName);  // NIT
            
            
   
		
	}
}
