package com.Labwork;
import java.util.*;
public class Atm {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("WELCOME TO HDFC ATM");
		System.out.println("ENTER PIN");
		int pin=sc.nextInt();
		
		int balance=99000;
		
		if(pin==2929)
		{
				System.out.println("1-DEPOSIT\n 2-WITHDRAW\n 3-CHECK BALANCE\n 4-EXIT\n");
				System.out.println("Enter the choice");
				int choice=sc.nextInt();
				if(choice==1)
				{
					System.out.println("Enter the deposit amount");
					int deposit=sc.nextInt();
					int totalbalance=balance+deposit;
					System.out.println("your balance is :"+totalbalance);
				}
				else if(choice==2)
				{
					System.out.println("Enter the withdraw amount");
					int withdraw=sc.nextInt();
					balance-=withdraw;
					System.out.println("your balance is :"+balance);
				}
				else if(choice==3)
				{
					System.out.println("Your balance is :"+balance);
				}
				else if(choice==4)
				{
					System.out.println("EXIT");
				}
				else
				{
					System.out.println("THANK YOU");
				}
			}
		
		

	}

}
