package com.day6;

public class _2dcolSum {

	public static void main(String[] args) {
		
		
		int[][] arr = { {1,2,3},
				        {4,5,6}, 
				        {7,8,9}};
		int n = 3;
		int m = 3;
		
		
		 for(int row = 0; row<n; row++) {
			   int sum = 0;
			for(int col = 0; col<m; col++) {
				if(arr[row][col] % 2 == 0) {
				  sum += arr[col][row];        // Accessing col here
				}
			}
			 System.out.println(sum);
		 }
		 
		
		
	}

}
