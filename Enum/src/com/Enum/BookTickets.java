package com.Enum;

import java.util.Scanner;

public class BookTickets {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose the ticket type");
		System.out.println("1.Standard");
		System.out.println("2.Premium");
		System.out.println("3.Recliner");
		
		int seattype=sc.nextInt();
		
		System.out.print("Enter number of seats :");
		int num=sc.nextInt();
		
		MovieSeat ms=null;
		
		switch(seattype)
		{
		case 1: ms=MovieSeat.STANDARD;
		break;
		case 2: ms=MovieSeat.PREMIUM;
		break;
		case 3: ms=MovieSeat.RECLINER;
		break;
		default: System.out.println("Error");
		
		}
		System.out.println("Ticket type :"+ms);
		System.out.println("Number of ticket :"+num);
		System.out.println("Total amount :"+(num*(ms.price)));
		

	}

}
