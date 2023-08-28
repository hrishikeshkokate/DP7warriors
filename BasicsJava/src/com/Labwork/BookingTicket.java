package com.Labwork;
import java.util.Date;
import java.util.Scanner;
public class BookingTicket {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to BOOK MY TICKET");
		
		Date d=new Date();
		System.out.println(d);
		
		System.out.println("Enter the name of airline");
		String air= sc.next();
		
		System.out.println("Enter the departure place");
		String dep= sc.next();
		
		System.out.println("Enter the destination place");
		String des= sc.next();
		
		System.out.println("Enter the coupn code");
		int co= sc.nextInt();
	
		double p=10000;
		
		if(co==2929)
		{
			System.out.println("you got discount of 20%");
			System.out.println("ticket price is :"+(p-(p*0.1)));
		}
		else
		{
			System.out.println("Code is invalid");
		}
		
			
		

	}

}
