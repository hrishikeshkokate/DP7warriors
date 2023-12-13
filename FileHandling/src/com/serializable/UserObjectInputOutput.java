package com.serializable;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserObjectInputOutput {
	
	static Scanner sc= new Scanner(System.in);
	
	public void readData(File f)
	{
		try {
			
			if(f.exists())
			{
				ObjectInputStream oin= new ObjectInputStream(new FileInputStream(f));
				for(int i=0;i<3;i++)
				{
					User user=(User) oin.readObject();
					System.out.println(user);
				}
				
				oin.close();
				
			}
			else
			{
				System.out.println("File doesnot exists.......");
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void writeUserData(File f) {
		try {

			if (f.exists()) {
				f.createNewFile();
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ObjectOutputStream oout= new ObjectOutputStream(new FileOutputStream(f));
			User u[]= new User[3];
			for(int i=0;i<u.length;i++)
			{
				u[i]= new User();
				System.out.println("Enter user id:");
				u[i].setUserid(sc.nextInt());
				
				System.out.println("Enter user name:");
				u[i].setUname(br.readLine());
				
				System.out.println("Enter password:");
				u[i].setPassword(sc.next());
				
				oout.writeObject(u[i]);
				System.out.println("User "+(i+1)+"is added .........");
				
			}
				
			System.out.println("------------------------------------------------");
			oout.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		UserObjectInputOutput obj = new UserObjectInputOutput();
		File f1 = new File("D:\\DP7Warriors\\MyFiles\\userdata.txt");
		
		//obj.writeUserData(f1);
		obj.readData(f1);

		sc.close();
	}

}
