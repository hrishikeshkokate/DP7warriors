package com.Incapulation;

import java.util.Scanner;

public class Bank_Customer {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the customer id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the account number");
		int acc=sc.nextInt();
		
		
		Customer c= new Customer();
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setAccountNo(acc);
		
		System.out.println(c);
		
		System.out.println("____________________________");
		
		System.out.println("You want to credit or debit");
		char option=sc.next().charAt(0);
		System.out.println("Enter the amount");
		int amount=sc.nextInt();
		
		if(option=='C')
		{
			double balance=c.getBalance();
			balance=balance+amount;
			c.setBalance(balance);
			System.out.println(amount+" Credited");
			System.out.println("Available balance :"+balance);
		}
		else
		{
			double balance=c.getBalance();
			balance=balance-amount;
			c.setBalance(balance);
			System.out.println(amount+" Debited");
			System.out.println("Available balance :"+balance);
		}
		System.out.println(c.getBalance());
	}

}
