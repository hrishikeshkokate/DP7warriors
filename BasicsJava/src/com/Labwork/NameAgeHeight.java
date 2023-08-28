package com.Labwork;
import java.util.*;
public class NameAgeHeight {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name :");
		String name=sc.next();
		
		System.out.println("Enter gender :");
		String gender=sc.next();
		
		System.out.println("Enter age :");
		int age=sc.nextInt();
		
		System.out.println("Enter height");
		int height=sc.nextInt();
		
		System.out.println("Name of person :"+name);
		System.out.println("Height of person :"+height);
		System.out.println("Age of person :"+age);
		System.out.println("Gender of person :"+gender);
		
		sc.close();
	}

}
