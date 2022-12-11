package com.ticket;

public class Ticket {
	
	int ticketid;
	int price;
	static int availableTickets;

	public int calculateTicketCost(int noOfTickets) {
		if(noOfTickets>0) {
		int	availTickets = availableTickets-noOfTickets;
			int total= noOfTickets*price;
			
			return total;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
