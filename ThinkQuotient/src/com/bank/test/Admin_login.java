package com.bank.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.bank.dao.UserDaoImpl;
import com.bank.pojo.User;

public class Admin_login {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int userid;
		String username;
		String useremail;
		String usercontact;
		String userdob;
		String userpan;
		String useraadhar;
		String useraddress;
		String userpass;
		User user;
		List<User> ulist;
		UserDaoImpl userdao = new UserDaoImpl();
		boolean result;
		int choice;

		do {
			System.out.println("\n");
			System.out.println("1. Update user");
			System.out.println("2. Delete user");
			System.out.println("3. Show user list");
			System.out.println("4. Show list with Account details");
			System.out.println("5. Search by ID");
			System.out.println("6. Search by E-mail");
			System.out.println("7. Search by Account No");
			System.out.println("8. Search by Aadhar");
			System.out.println("9. update status");
			System.out.println("10. Sign Out");

			System.out.println("\n---------------------------------\n");

			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("---------------------------------\n");

				System.out.println("Enter user ID :");
				userid = sc.nextInt();
				System.out.println("Name :");
				username = sc.next();
				System.out.println("E-mail :");
				useremail = sc.next();
				System.out.println("Contact :");
				usercontact = sc.next();
				System.out.println("Date of birth :");
				userdob = sc.next();
				System.out.println("Pan details :");
				userpan = sc.next();
				System.out.println("Aadhar no :");
				useraadhar = sc.next();
				System.out.println("Address :");
				useraddress = sc.next();
				System.out.println("New password:");
				userpass = sc.next();
				user = new User(userid, username, useremail, usercontact, userdob, userpan, useraadhar, useraddress,
						userpass);
				try {
					result = userdao.updateUser(user);
					if (result)
						System.out.println("\nUser details updated successfully.");
					else
						System.out.println("\nError user not updated..!");
				} catch (SQLException e) {

					e.printStackTrace();
				}
				System.out.println("\n---------------------------------");
				break;

			case 2:
				System.out.println("---------------------------------\n");

				System.out.println("Enter user id :");
				userid = sc.nextInt();
				try {
					result = userdao.deleteUser(userid);
					if (result) {
						System.out.println("\nUser deleted.");
					} else {
						System.out.println("\nError user not deleted.");
					}
				} catch (SQLException e) {

					e.printStackTrace();
				}
				System.out.println("\n---------------------------------");
				break;

			case 3:
				System.out.println("\n---------: User List :---------\n");
				try {
					ulist = userdao.showUserList();
					if (!ulist.isEmpty()) {
						for (User u : ulist) {
							System.out.println(u);
						}
					} else {
						System.out.println("\nUserlist is empty..!");
					}
				} catch (SQLException e) {

					e.printStackTrace();
				}
				System.out.println("\n---------------------------------");
				break;

			case 4:
				System.out.println("\n-----: User list with account details :-----\n");
				try {
					ulist = userdao.showUserWithAccount();
					if (!ulist.isEmpty()) {
						for (User u : ulist) {
							System.out.println(u);
						}

					} else {
						System.out.println("\nUserlist is empty..!");
					}
				} catch (SQLException e) {

					e.printStackTrace();
				}
				System.out.println("\n---------------------------------");
				break;

			case 5:
				System.out.println("---------------------------------\n");

				System.out.println("User ID :");
				userid = sc.nextInt();
				try {
					user = userdao.searchUserByUserid(userid);
					if (user != null) {
						System.out.println(user);
					} else {
						System.out.println("\nUser not found..!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("\n---------------------------------");
				break;

			case 6:
				System.out.println("---------------------------------\n");

				System.out.println("E-mail ID :");
				useremail = sc.next();
				try {
					user = userdao.searchUserByEmail(useremail);
					if (user != null) {
						System.out.println(user);
					} else {
						System.out.println("\nUser not found..!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("\n---------------------------------");
				break;

			case 7:
				System.out.println("---------------------------------\n");

				System.out.println("\nAccount no :");
				int accno = sc.nextInt();
				try {
					user = userdao.searchUserByAccountno(accno);
					if (user != null) {
						System.out.println(user);
					} else {
						System.out.println("\nUser not found..!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("\n---------------------------------");
				break;

			case 8:
				System.out.println("---------------------------------\n");

				System.out.println("\nAaadhar No :");
				useraadhar = sc.next();
				try {
					user = userdao.searchUserByAadhar(useraadhar);
					if (user != null) {
						System.out.println(user);
					} else {
						System.out.println("\nUser not found");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
				System.out.println("\n---------------------------------");
				break;

			case 9:
				System.out.println("---------------------------------\n");
				System.out.println("\nEnter your E-mail :");
				String uemail = sc.next();
				System.out.println("\nEnter your Password :");
				String upass = sc.next();

				try {
					result = userdao.updateStatus(uemail, upass);
					if (result) {
						System.out.println("\nStatus updated to active.");
					} else {
						System.out.println("\nError status not updated..!");
					}
				} catch (SQLException e) {

					e.printStackTrace();
				}

				System.out.println("---------------------------------\n");

				break;

			case 10:
				Register_Login.main(null);
				break;

			}

		} while (true);
	}

}
