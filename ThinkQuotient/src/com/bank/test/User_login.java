package com.bank.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.bank.dao.AccountDaoImpl;
import com.bank.pojo.Transaction;
import com.bank.pojo.User;

public class User_login {

	static Scanner sc = new Scanner(System.in);

	public static void loginUser(String email) {

		boolean result;
		List<Transaction> tlist = null;
		AccountDaoImpl a = new AccountDaoImpl();

		do {
			System.out.println("\n1.Deposite\t\t2.Withdraw\n3.Balance\t\t4.Transaction\n5.Show transactions\t6.Sign Out\n");
			System.out.println("Enter Your Choice...");
			int choice = sc.nextInt();

			switch (choice) {

			case 1://Deposit
				System.out.println("\nEnter amount : ");
				double d_amt = sc.nextLong();

				try {
					result = a.deposit(email, d_amt);
					if (result) {
						System.out.println("\nAmount deposited successfully.");
					} else {
						System.out.println("\nEnter valid values...!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("\nInput Error..!");
					e.printStackTrace();
				}

				break;
				
			case 2://Withdraw
				System.out.println("\nEnter Amount : ");
				double w_amt = sc.nextDouble();

				try {
					result = a.withdraw(email, w_amt);
					if (result) {
						System.out.println("\nAmount widrawal successfully.");
					} else {
						System.out.println("\nInsufficient balance..!");
					}

				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("\nInput Error..!");
					e.printStackTrace();
				}
				break;

			case 3://Show_Balance

				try {

					System.out.println("\nBalance : " + a.showBalance(email));
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("\nInput Error..!");
					e.printStackTrace();
				}
				break;

			case 4://Transaction
				System.out.println("\nEnter Mobile No of Account Holder :");
				String t_no = sc.next();

				System.out.println("\nEnter Amount : ");
				double t_amt = sc.nextDouble();

				try {
					result = a.transaction(email, t_no, t_amt);
					if (result) {
						System.out.println("\nTransaction Successfull.");
					} else {
						System.out.println("\nTransaction Error..!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("\nInput Error..!");
					e.printStackTrace();
				}
				break;
				
			case 5 : 
				
				try {
					
					System.out.println("\n-------------------------------------");
					tlist = a.showTransactions(email);

					if (!tlist.isEmpty()) {
						for (Transaction u : tlist) {
							System.out.println(u);
						}
					} else {
						System.out.println("\nTransaction list is empty..!");
					}				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("\n-------------------------------------");
				break;

			case 6://Return to main page
				Register_Login.main(null);
				break;
			}
		} while (true);
	}
}
