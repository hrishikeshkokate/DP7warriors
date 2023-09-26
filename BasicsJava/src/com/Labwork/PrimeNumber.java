package com.Labwork;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num1=sc.nextInt();
		int count=0;
		//boolean flag=false;
		 for(int i=2;i<num1;i++)
		 {
			 if(num1%i==0)
				 count=1;
				 break;
				 //flag=true;
		 }
		 if(count==0)//flag==false
		 {
			 System.out.println("is prime number");
		 }
		 else
		 {
			 System.out.println("not a prime number");
		 }
		

	}

}
