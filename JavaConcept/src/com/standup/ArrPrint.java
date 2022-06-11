package com.standup;

import java.util.Arrays;
import java.util.Scanner;

public class ArrPrint {
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Enter the length of the array");
	  
	  int lengthOfArr = in.nextInt();
	  
	  String[] arr = new String[lengthOfArr];
	  in.nextLine();
	  
	  for(int i = 0; i<lengthOfArr; i++) {
		  arr[i] = in.nextLine();
	  }
	  
	
	   System.out.println(Arrays.toString(arr));
	   // avoiding address printing by toString.
	
}
}
