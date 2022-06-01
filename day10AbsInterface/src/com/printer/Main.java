package com.printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConsolePrinter cp = new ConsolePrinter();
		Printer p1 = new ConsolePrinter();
		Printer p2 = new FilePrinter();
		cp.print();
		p1.print();
		p2.print();
		
		
		
//		Printing on the console.
//		Printing on the console.
//		Printing on the File.

	}

}
