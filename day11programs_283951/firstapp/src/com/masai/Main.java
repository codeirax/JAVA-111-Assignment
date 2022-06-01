package com.masai;

public class Main {

	
		
	
	
	
	public Intr fun1() {
		
		System.out.println("inside fun1 of Main..");
		
		return new A();
		
	}
	
	
	public static void main(String[] args) {
		
		Main m = new Main();
		
		Intr i1= m.fun1();
	
		Object obj= m.fun1();
		
		//first level downcasting
		Intr i2= (Intr)obj;
		
		i2.funX();
		i2.funY();
		
		//second level downcasting
		A a1= (A)i2;
		a1.funZ();
		
		
		i1.funX();
		i1.funY();
		
		
		a1.funZ();
		
		
	}

	
}
