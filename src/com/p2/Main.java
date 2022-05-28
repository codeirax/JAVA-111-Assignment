package com.p2;



public class Main {
	
	 public static void main(String[] args){
		
	
		
		 DayScholar d1 = new DayScholar(121, "Shubham", 5000, 1500);  // <-- Creating object
		  double remScholorDay =  d1.payFee(5000);         // Setting amount to student     
		  
	     System.out.println("School Student Detais with remaining Fee");
		 System.out.println("Remaining Fee " + remScholorDay);
		 d1.displayDetails();
		 
		 
		 Hosteller h1 = new Hosteller(333, "Ritesh", 25000, 2000);
		 double remHostelFee = h1.payFee(3000);
		 
		 System.out.println("*********************************");
		 System.out.println("Hostel Student details");
		 System.out.println("Remaining Fee " + remHostelFee);
		 
		 h1.displayDetails();
	}
	 
	}


 class Student{   //<- constructor
	
	int studId;
	String StudName;
	double examFee;
	
	
  public void displayDetails(){
		System.out.println("Name :" + StudName);
		System.out.println("Student Id :" + studId);
		
	}
  

  double payFee(double amount) { // <-- examfee - args (amount)
	     
	  double rem = examFee - amount;
	   return rem;
	  
	}
  
  
 Student(int studId,String name,double fee){   
	   this.studId = studId;
	   this.StudName = name;
	   this.examFee = fee;
 }

 

  
}

// another class

 class DayScholar extends Student{
	 
	 double transportFee;
	 
	DayScholar(int studId, String name, double fee, double transportFee) {
		super(studId, name, fee);
		    this.studId = studId;
		    this.StudName = name;
		    this.examFee = fee;
		    this.transportFee = transportFee;
		
	}
	

		@Override
    double payFee(double amount) {
	  
	    double rem = examFee + transportFee - amount;
	    return rem;
	  }
    

	
}


// Another class
 class Hosteller extends Student{
	 double hostelFee;

	Hosteller(int studId, String name, double fee , double hsFee) {
		super(studId, name, fee);
		   this.studId = studId;
		    this.StudName = name;
		    this.examFee = fee;
		    this.hostelFee = hsFee;	
	}
	
	@Override
    double payFee(double amount) {
	  
	    double rem = hostelFee + examFee - amount;
	    return rem;
	    		
	   }
		
 }








