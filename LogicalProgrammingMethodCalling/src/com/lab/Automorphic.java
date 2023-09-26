package com.lab;

import java.util.Scanner;

public class Automorphic {
	static int count=0;
	
	static int reverseNumber(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
			count++;
		}
		return rev;
	}
	
	static int automorphic(int num)
	{
		int num1=num;
		int sqr=num*num;
		int rev1=0;
		for(int i=1;i<=count;i++)
		{
			int rem=num1%10;
			rev1=(rev1*10)+rem;
			num1/=10;
		}
		return rev1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		//System.out.println(reverseNumber(num));
		//System.out.println(automorphic(num));
		if(reverseNumber(num)==automorphic(num))
		{
			System.out.println(num+" is automorphic");
		}
		else
		{
			System.out.println(num+" is not automorphic");
		}

	}

}
