package com.prob2;

import java.util.Scanner;

class Ticket{
	private int ticketid;
	private int price;
	private static int availaiableTickets;
	
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
	public static int getAvailaiableTickets() {
		return availaiableTickets;
	}
	
		public static void setAvailaiableTickets(int availaiableTickets) {
		Ticket.availaiableTickets = availaiableTickets;
	}
	
	
//	method
	

	public int calculateTicketCost(int nooftickets) {
//		if ticket are available then 
		if(availaiableTickets - nooftickets > 0) {
			
		
		availaiableTickets =	availaiableTickets - nooftickets;
	
	
	  return price*nooftickets;
	 	}
		else
	 	{
	 		return -1;
	 	}
	}
	
}

public class Main{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of Booking");
	   int bookingTicket = 	in.nextInt();
	  
	  System.out.println("Enter the Available tickets");
	    int availTickets = in.nextInt();
	    
	    Ticket ticket = new Ticket();
	    Ticket.setAvailaiableTickets(availTickets);
	    
	    
	 
	    for(int i = 0; i<bookingTicket; i++) {
	    	//Taking input from user for each booking
	    	  System.out.println("Enter ticket Id");
	      int ticketId =  in.nextInt();
	    ticket.setTicketid(ticketId);
		
		
		System.out.println("Enter the Price");
		int price = in.nextInt();
		ticket.setPrice(price);
		
		System.out.println("Enter the no of tickets");
		int noofTickets = in.nextInt();
		
		
		
		int ticketBeforeBooked = Ticket.getAvailaiableTickets();
		int totalPrice = ticket.calculateTicketCost(noofTickets);
		
		
//		printing part
		
		if(totalPrice != -1) {
			System.out.println("Available tickets :" + ticketBeforeBooked);
			System.out.println("Total Amount :" + totalPrice);
			System.out.println("Available ticket after Booking :" + Ticket.getAvailaiableTickets());
		}
		else {
			System.out.println("Tickets are not available");
		}
		
	    }
	  	//
	}
}





