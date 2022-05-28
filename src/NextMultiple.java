package com.masai;

public class NextMultiple {

	public static void main(String[] args) {
		int N = -1;
		if(N<0) {
			System.out.println("Error");
			
		}else if(N%2 == 0){
		 
			System.out.println(N-N%10 + 10);
			
		}else {
			System.out.println(N);
		}
	}
}
