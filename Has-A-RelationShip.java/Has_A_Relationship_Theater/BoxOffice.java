package com.jsp.Has_A_Relationship_Theater;

public class BoxOffice {
	public static void main(String[] args) {
		Theatre theatre=new Theatre("INOX",500);
		//create ticket object
		theatre.setTicket(new Ticket("IB71",50));
		theatre.bookTicket();
		theatre.showTicketDetails();
		theatre.cancelTicket(25);
		theatre.checkAvailability();
		theatre.showTicketDetails();
	}
	}

