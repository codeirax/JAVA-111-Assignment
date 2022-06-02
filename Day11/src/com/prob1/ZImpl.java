package com.prob1;

public class ZImpl implements  Z{

	@Override
	public void abstractMethodx() {
		// TODO Auto-generated method stub
		System.out.println("I am inside abstractMethodx in ZImpl");
	}

	@Override
	public void abstractMethodY() {
		// TODO Auto-generated method stub
		System.out.println("I am inside abstractMethodY in ZImpl");
		
	}

	@Override
	public void zMethod() {
		// TODO Auto-generated method stub
		System.out.println("I am inside zMethod in ZImpl");
		
	}

	
	@Override
	// default method x should be overridden
	public void defaultMethodx() {
		System.out.println("I am inside default methodx in ZImpl ");
	}

	
	

}
