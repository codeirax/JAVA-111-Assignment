package com.day4;

public class Java {
	
	
	
	public void checkEveOddMult(int n) {
		
		if(n%2 == 1) {
			
			System.out.println(n);
		}
		else if(n%2 == 0) {
			
			System.out.println(n- n%10 + 10);
			
			
		}
		else if(n<0) {
			
			System.out.println("Error");
		}
		
	}
	
	public static void main(String[] args) {
		
		Java j1 = new Java();
		
		j1.checkEveOddMult(44);  // 50
		j1.checkEveOddMult(45);  // 45
		j1.checkEveOddMult(-5);  // error
	
	}

}
