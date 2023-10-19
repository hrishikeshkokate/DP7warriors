package com.cutomexception;

import java.util.Scanner;

public class Nameaccept {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=sc.next();
		try
		{
			if(name.length()<3)
			{
				throw new Invalidnameexception("Name should be greater than 2 character");
			}
			System.out.println("Welcome "+name);
		}
		catch(Invalidnameexception e)
		{
			System.out.println(e);
		}

	}

}
