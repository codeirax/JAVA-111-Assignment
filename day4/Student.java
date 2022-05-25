package com.day4;

public class Student {


	// Java bean
 private int roll;
 private String name;
 private int age;
 private int marks;
 
 
  
  public Student() {  // Zero Argument constructor
	  
	  
  }
 
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	
	this.age = age;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}




// Parameterized constructor
  public Student(int r , String n, int a,int m ) {
	  
	  if(a > 18 && a<60 && m> 0 && m<500) {
		  this.roll = r;
		  this.name = n;
		  this.age = a;
		  this.marks= m;
	  }

  }

  public void printDetails() {
	if(getAge() > 18 && getAge() < 60 && getMarks() > 0 && getMarks() < 500) {
		  System.out.println("Roll is " + roll);
		  System.out.println("name is " + name);
		  System.out.println("age is " + age);
		  System.out.println("marks is " + marks);
	  }
	   else {
		   System.out.println("Invalid");
   }
	  
	  
  }
  
  
	public static void main(String[] args) {
		
	Student s1  = new Student();	
		s1.printDetails();
		
	  Student s2 = new Student(3,"Shiva",50,100);
	   s2.printDetails();
	   
	Student s3 = new Student(4,"Ritesh",22,555);
	   s3.printDetails();
	   
	   
	}
}
