package com.prob3;

import java.util.Scanner;

public class Demo {

	void showDetails(Month m) {
		
	switch (m) {
	case JAN:
		System.out.println("This is january");
		break;
	case FEB:
		System.out.println("This is february");
		break;
	case MAR: 
		System.out.println("This is march");
		break;
		
	case  APR:
		System.out.println("This is april");
		break;
	case MAY: 
		System.out.println("This is may");
		break;
	case JUN:
		System.out.println("This is June");
		break;
	case JUL :
		System.out.println("This is july");
		break;
	case AUG :
		System.out.println("This is august");
		break;
	case SEP :
		System.out.println("This is august");
		break;
		
	case OCT :
		System.out.println("This is october");
		break;
	case NOV :
		System.out.println("This is november");
		break;
	case DEC :
		System.out.println("This is December");
		break;
	default:
		break;
	}	
		
	}
	
	
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		try {
			Scanner in = new Scanner(System.in);
		System.out.println("Enter Month Name :");
	String enteredMonthName =in.next();
	
 
	
		d1.showDetails(Month.valueOf(enteredMonthName));	
		}
		catch(Exception e) {
			System.out.println("Invalid month Name");
		}
	
	}
}
