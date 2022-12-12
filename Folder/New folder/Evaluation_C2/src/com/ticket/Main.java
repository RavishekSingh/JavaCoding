package com.ticket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of bookings:");
		int num = sc.nextInt();
		
		System.out.println("Enter the available tickets: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the ticketid: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the price: ");
		int num3 = sc.nextInt();
		
		System.out.println("Enter the no of tickets: ");
		int num4 = sc.nextInt();
		
		Ticket t1 = new Ticket();
		
		
		System.out.println("Available tickets: "+num1);
		System.out.println("Total amount: "+ t1.calculateTicketCost(num4));
		System.out.println("Available ticket after booking: "+t1.availableTickets);

	}

}
