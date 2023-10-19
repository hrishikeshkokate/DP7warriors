package com.stringlogical;

import java.util.Scanner;

import java.util.Scanner;

public class PasswordValidation 
{
	static void passCheck(String s, String s1) 
	{
		int cap = 0;
		int spe = 0;
		int spc = 0;
		int count = 0;
		int len = 0;
		char st[] = s1.toCharArray();
		for (int i = 0; i < st.length; i++) 
		{
			if (s1.length() > 8) 
			{
				len = 1;
			}
			if (st[i] >= '0' && st[i] <= '9') 
			{
				count = 1;
			}

			if (st[i] >= 'A' && st[i] <= 'Z')
			{
				cap = 1;
			}
			if (st[i] == '#' || st[i] == '@') 
			{
				spe = 1;
			}
			if (st[i] != ' ') 
			{
				spc = 1;
			}

		}

		if (count == 1 && cap == 1 && spe == 1 && spc == 1 && len == 1)
		{
			System.out.println("pass word is correct");
		}

		else 
		{
			if (len == 0) 
			{
				System.out.println("length of password must have greater than or equal to 8");
			}
			if (spc == 0) 
			{
				System.out.println("password should not contain space inbetween");
			}

			if (spe == 0)
			{
				System.out.println("password should contain atleast one special character");
			}

			if (cap == 0) 
			{
				System.out.println("password should contain atleast one capital letter");

			}
			if (count == 0) 
			{
				System.out.println("password should contain atleast one digit ");

			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter user name");
		String username = sc.next();
		
		System.out.println("Enter password");
		String pass = sc.next();
		
		passCheck(username, pass);

	}

}
