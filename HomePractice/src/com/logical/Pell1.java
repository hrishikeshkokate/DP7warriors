package com.logical;

import java.util.Scanner;

public class Pell1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int a;
		int b=0;
		int sum=1;
		if(b==0)
			System.out.println(b);
		for(int i=1;i<=num;i++)
		{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=sum*2+a;
		}

	}

}
