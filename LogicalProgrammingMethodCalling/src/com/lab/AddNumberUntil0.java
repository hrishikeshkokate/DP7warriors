package com.lab;

import java.util.Scanner;

public class AddNumberUntil0 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int sum=0;
		while(true)
		{
		int num=sc.nextInt();
		 
	     sum=sum+num;
	  
	     if(num==0)
	    	 break;
	    
		}
		System.out.println(sum);

	}

}
