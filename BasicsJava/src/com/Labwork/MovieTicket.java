package com.Labwork;
import java.util.*;
public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("BOOK MY TICKET");
		
		System.out.println("Enter the movie name");
		String movie=sc.next();
		
		System.out.println("Enter rating out of 10");
		int rating=sc.nextInt();
		
		System.out.println("Enter the price");
		int price=sc.nextInt();
		
		System.out.println("enter coupen code");
		int code=sc.nextInt();
		
		Date d=new Date();
		
		if(code==50)
		{
			System.out.println("you got discount of 50 rupees ="+(price-50));
		}
		else if(code==100)
		{
			System.out.println("you got discount of 100 rupees ="+(price-100));
		}
		else
		{
			System.out.println("Code is invalid");
			System.out.println("Your ticket got booked at ="+price);
		}
		System.out.println(d);

	}

}
