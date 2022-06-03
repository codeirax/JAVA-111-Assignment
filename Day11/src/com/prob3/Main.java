package com.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		IPL std = new IPL();   // to accessing method.
		
		Scanner in = new Scanner(System.in);
		
	  System.out.println("Enter Stadium Name");
	  
	    String enteredStdName =  in.next();
	    
	    
           
	 Stadium s1 =   Stadium.valueOf(enteredStdName);  //<-- enum format
	    
	   std.homeTeamStadium(s1);
	    
	   
	}

}
