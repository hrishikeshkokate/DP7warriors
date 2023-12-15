package com.bank.test;

import java.sql.SQLException;

import java.util.Scanner;

import com.bank.dao.UserDaoImpl;
import com.bank.pojo.User;

public class Register_Login {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String username;
		String useremail;
		String usercontact;
		String userdob;
		String userpan;
		String useraadhar;
		String useraddress;
		String userpass;
		User user;
		UserDaoImpl userdao = new UserDaoImpl();
		boolean result;
		

		System.out.println("-------------------------------------");
		System.out.println("\n     * * * * * WelCome * * * * *\n");

		do {
			System.out.println("-------------------------------------");

			System.out.println("\n\t 1.Register\n\t 2.User login\n\t 3.Admin login\n\t 4.Exit");
			System.out.println("\n-------------------------------------");
			System.out.println("Enter Choice : ");
			int choice1 = sc.nextInt();

			switch (choice1) {
			case 1://Register User

				System.out.println("----: Register Your Account :----\n");

				System.out.println("Enter user name:");
				username = sc.next();
				System.out.println("Enter user email:");
				useremail = sc.next();
				System.out.println("Enter user contact:");
				usercontact = sc.next();
				System.out.println("Enter user dob:");
				userdob = sc.next();
				System.out.println("Enter user pan:");
				userpan = sc.next();
				System.out.println("Enter user aadhar:");
				useraadhar = sc.next();
				System.out.println("Enter user address:");
				useraddress = sc.next();
				System.out.println("Enter user password:");
				userpass = sc.next();
				
				user = new User(username, useremail, usercontact, userdob, userpan, useraadhar, useraddress, userpass);
				try {
					result = userdao.addUser(user);
					if (result) {
						System.out.println("\nUser added successfully...!");
						Register_Login.main(null);
					}
					else
						System.out.println("\nError user not added...!");
				} catch (SQLException e) {

					e.printStackTrace();
				}
				System.out.println("-------------------------------------");
				break;
				
			case 2://Login
				System.out.println("-------------------------------------");
				System.out.println("\nE-mail : ");
				String email = sc.next();
				System.out.println("\nPassword : ");
				String passs = sc.next();
				try {
					user = userdao.searchUserByContact(email, passs);
					if (user != null) {
						System.out.println(user);
						User_login.loginUser(email);

					} else {
						System.out.println("\nUser not found...!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					System.out.println("\nPlease activate your account first..!");
				} 

				break;
				
			case 3://Admin Login
				System.out.println("-------------------------------------");
				System.out.println("\nE-mail : ");
				String aemail = sc.next();
				System.out.println("\nPassword : ");
				String pass = sc.next();
				try {
					user = userdao.searchAdminByContact(aemail, pass);
					if (user != null) {
						System.out.println(user);
						Admin_login.main(null);

					} else {
						System.out.println("\nUser not found");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case 4://exit code
				System.out.println("\nThank You...");
				System.exit(4);
				break;

			}

		} while (true);

	}

}
