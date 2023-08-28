package com.IfElse;
import java.util.*;
public class StudentPercentage {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter marks of subject1");
		float sub1=sc.nextFloat();
		System.out.println("Enter marks of subject2");
		float sub2=sc.nextFloat();
		System.out.println("Enter marks of subject3");
		float sub3=sc.nextFloat();
		System.out.println("Enter marks of subject4");
		float sub4=sc.nextFloat();
		System.out.println("Enter marks of subject5");
		float sub5=sc.nextFloat();
		
		float per = ((sub1+sub2+sub3+sub4+sub5)/500)*100;
		
		if(per>40)
		{
			System.out.println("you are passed");	
		}
		else
		{
			System.out.println("better luck next time");
		}
		
		
		
		
		sc.close();
	}

}
