package com.logical;

import java.util.Scanner;

public class EvenNumberSum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the range");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				
			}
		}
		System.out.println(sum);
		

	}

}
