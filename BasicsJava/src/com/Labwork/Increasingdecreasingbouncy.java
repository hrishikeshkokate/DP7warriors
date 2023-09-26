package com.Labwork;

import java.util.Scanner;

public class Increasingdecreasingbouncy 
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner (System.in);	
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int num1=num;
	
	int count=0;
	while(num!=0)
	{
		num/=10;
		count++;
	}
     int count1=0;
     int digit=0;
     while(num1!=0)
     {
    	 int rem=num1%10;
    	 //if(digit)
     }
     
	}

}
