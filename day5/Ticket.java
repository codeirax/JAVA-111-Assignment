package com.day5;

import java.util.Scanner;

public class Ticket {
	
	private int ticketid;
	private int price;
	private static int availableTickets;

	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets ;
	}
	
	
	
	public int calculateTicketCost(int nooftickets) {
   
		if(this.availableTickets > 0) {
			int reduced = availableTickets - nooftickets;
			int totalAmount = nooftickets * this.price;
			return totalAmount;
		}else {
			return -1;
		}
		
		
	}
	
	
	
	public static class Main{
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter no of booking");
			in.nextInt();
			
			System.out.println("Enter available ticket");
		  in.nextInt();
		  
		  System.out.println("Enter ticket id");
		  in.nextInt();
		  
		  System.out.println("Enter the Price");
		  in.nextInt();
			
		  System.out.println("Enter the no of Tickets");
		  in.nextInt();
		  
		  System.out.println("Available tickets");
		  in.nextInt();
		  
		}
	}

}
