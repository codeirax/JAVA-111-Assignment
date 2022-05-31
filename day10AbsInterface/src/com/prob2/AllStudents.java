package com.prob2;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	 System.out.println("Enter Science Student Name :");
     String enteredScienceStudName = in.nextLine();
     
     System.out.println("Enter Address of Science Student");
     String enteredAddresOfScienceStud = in.nextLine();
     
     System.out.println("Enter Your Physics Marks");
     int enteredPhymarks = in.nextInt();
     
     in.nextLine();
     System.out.println("Enter Your Chemistry Marks");
     int enteredChemMarks = in.nextInt();
     
     in.nextLine();
     
     System.out.println("Enter Your Maths Marks");
     int enteredMathsMarks = in.nextInt();
     in.nextLine();
     
     System.out.println("***************");
     System.out.println();
    
  ScienceStudent scienceStud1 = new ScienceStudent(enteredScienceStudName, enteredAddresOfScienceStud);
     
  scienceStud1.setChemistryMarks(enteredChemMarks);
  scienceStud1.setMathMarks(enteredMathsMarks);
  scienceStud1.setPhyicsMarks(enteredPhymarks);
  
      System.out.println("Science Student Name :" + scienceStud1.name);
     System.out.println("Science Student Percentages : " + scienceStud1.getPercentage() );
      
      System.out.println("*************");
      System.out.println();
      
      
      System.out.println("Enter History Student Name :");
      String enteredHistoryStudName = in.nextLine();
      
      System.out.println("Enter Address of History Student");
      String enteredAddresOfHistoryStud = in.nextLine();
      
      System.out.println("Enter Your History Marks");
      int enteredHistMarks = in.nextInt();
      
      in.nextLine();
      System.out.println("Enter Your Civics Marks");
      int enteredCivicsMarks = in.nextInt();
      
      
   
System.out.println("*********************************");
		HistoryStudent historyStudent1 = new HistoryStudent(enteredHistoryStudName,enteredAddresOfHistoryStud );
  
		historyStudent1.setCivicsMarks(enteredCivicsMarks);
        historyStudent1.setHistoryMarks(enteredHistMarks);
       
       
       System.out.println("*********************************");
     System.out.println();
     System.out.println("History Student Name :" + historyStudent1.name);
       System.out.println("History Student Percentage is :" + historyStudent1.getPercentage());
      
	}

}
