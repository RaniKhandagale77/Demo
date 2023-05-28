package com.jsp.Has_A_Relationship_Theater;

public class Theatre {
	private String theatre_name;
	private int seating_capacity;
	//ticket
	private Ticket ticket;
	//constructor
	public Theatre(String tname,int sc) {
		this.theatre_name=tname;
		this.seating_capacity=sc;
	}
	//public getters and setters
	public String getTheatre_name() {
		return theatre_name;
	}
	public void setTheatre_name(String theatre_name) {
		this.theatre_name = theatre_name;
	}
	public int getSeating_capacity() {
		return seating_capacity;
	}
	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	//Functionalities
	//book my ticket
	public void bookTicket() {
	if(ticket.getNo_of_tickets()!=0&& ticket.getNo_of_tickets()<=seating_capacity) 
	{
	  seating_capacity= seating_capacity-ticket.getNo_of_tickets();	
	System.out.println("Your Booking of"+ticket.getNo_of_tickets()+" has been booked");
	}else {
		System.out.println("Booking not successfull");
	}
	}
	
	//check availability
	
	public void checkAvailability() {
		System.out.println(seating_capacity);
	}
	//cancel
	public void cancelTicket(int cancel_tickets) {
		if(cancel_tickets!=0&& cancel_tickets<=ticket.getNo_of_tickets()) {
			seating_capacity=seating_capacity+cancel_tickets;
			ticket.setNo_of_tickets(ticket.getNo_of_tickets()-cancel_tickets);
			
			System.out.println("Tickets cancelled");
		}else {
			System.out.println("Technical issue..");
		}
	}
	
	public void showTicketDetails() {
		System.out.println("Your Ticket Details are as follows");
		System.out.println(ticket.getMovie_name());
		System.out.println(ticket.getNo_of_tickets());
	}

}
