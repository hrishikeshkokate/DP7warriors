package com.lab;

import java.util.Scanner;

public class Armstrong 
{
	static void armstrong(int num)
	{
		int originalnum=num;
		int sum=0;
		while(originalnum!=0)
		{
			int rem=originalnum%10;
			int result=rem*rem*rem;
			sum=sum+result;
			originalnum=originalnum/10;
		}
		
		if(num==sum)
		{
			System.out.println(num+" is armstrong number");
		}
		else
		{
			System.out.println(num+" is not armstrong number");
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		armstrong(num);

	}

}
