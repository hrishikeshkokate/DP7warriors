package com.lab;

import java.util.Scanner;

public class Ticket {
	private int tId;
	static int price;
	static int availableTicket;

	static {
		price = 100;
		availableTicket = 25;
	}

	public void setTId(int tId) {
		this.tId = tId;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public static int getPrice() {
		return price;
	}

	public static void setPrice(int price) {
		Ticket.price = price;
	}

	public static int getAvailableTicket() {
		return availableTicket;
	}

	public static void setAvailableTicket(int availableTicket) {
		Ticket.availableTicket = availableTicket;
	}

	public int calculateTicketPrice(int noOfTickets) {
		int cost = 0;
		if (noOfTickets <= availableTicket) {
			cost = noOfTickets * price;
			Ticket.availableTicket = Ticket.availableTicket - noOfTickets;
		}
		return cost;

	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Ticket t1 = new Ticket();
		int noOfTickets=1;
		
		while (true) {
			System.out.print("Ticket Id:");
			t1.tId = ip.nextInt();

			System.out.print("No Of Tickets: ");
			noOfTickets = ip.nextInt();

			if (noOfTickets <= Ticket.availableTicket) {
				System.out.println("Available Tickets:" + Ticket.availableTicket);
				int cost = t1.calculateTicketPrice(noOfTickets);
				System.out.println("Total Cost Of Tickets:" + cost);
				System.out.println("Available Tickets After Booking:" + Ticket.availableTicket);
				System.out.println();

				if (Ticket.availableTicket == 0) {
					System.out.println("All tickets are sold");
					System.out.println("Available Tickets:" + Ticket.availableTicket);
					break;
				}
			} 
			else 
			{
				System.out.println("You Enter Wrong Input");
				System.out.println("Available Tickets:" + Ticket.availableTicket);
			}
		}

	}
}
