package com.switchst;

import java.util.Scanner;

public class Hdfc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("welcome to HDFC bank");
		System.out.println("Enter the pin");
		int pin = sc.nextInt();

		int balance = 99000;

		if (pin == 2929) {
			System.out.println("1-DEPOSIT\n 2-WITHDRAW\n 3-CHECK BALANCE\n 4-EXIT\n");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the deposit amount");
				int deposit = sc.nextInt();
				int totalbalance = balance + deposit;
				System.out.println("your balance is :" + totalbalance);
            break;
			case 2:
				System.out.println("Enter the withdraw amount");
				int withdraw = sc.nextInt();
				balance -= withdraw;
				System.out.println("your balance is :" + balance);
				break;
			case 3:
				System.out.println("Your balance is :" + balance);
				break;
			default:
				System.out.println("thank you visit again");

			}
		} 
		else 
		{
			System.out.println("Enter correct pin");
		}
	}

}
