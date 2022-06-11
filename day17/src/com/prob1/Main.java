package com.prob1;

public class Main {
public static void main(String[] args) {
	
	Song s1 = new Song("Mohabbatein", "Mohabbatein");
	Song s2 = new Song("Mohabbatein", "Mohabbatein");
	
	
	
	s1.play();
	
System.out.println("s1 and s2 is duplicate : " + s1.equals(s2));
	

	
	
}
}
