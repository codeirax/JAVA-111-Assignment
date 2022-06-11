package com.prob1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		
		int arrSize = input.nextInt();
	
		String[] arr = new String[arrSize];
		
		System.out.println("Enter elements of the array :");
		for(int i = 0; i < arrSize; i++) {
			
			String arrElem = input.next();  //taking input from the user
			arr[i] = arrElem;
		}
		
		
		// handling
		try {
			System.out.println("Enter the index of the array element you want to access :");
			int userSearch = input.nextInt();
			
			System.out.println("Element at index " + userSearch + " = " + arr[userSearch]);
			System.out.println("The array element successfully accessed");
		}
		
		catch(ArrayIndexOutOfBoundsException abe) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			System.out.println(abe.getMessage());
		}
		catch(InputMismatchException nfe) {
			System.out.println("java.lang.InputMismatchException");
			System.out.println(nfe.getMessage());
		}
	}
}