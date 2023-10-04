package com.arraylab;

import java.util.Scanner;

public class Averagerainfall {
	static void average(int arr[],int sum,int n)
	{
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			a=sum/arr.length;
		}
		System.out.println("Average rainfall is :"+a);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int sum=0;
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the rainfall value");
			arr[i]=sc.nextInt();
		}
		average(arr, sum, n);
		
		

	}

}
