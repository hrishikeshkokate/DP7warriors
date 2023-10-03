package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Sumofnumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[5];
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum is :"+sum);
		
		System.out.println("__________________________");
		
		float ar[]= {34.6f,54.9f,22.8f,67.8f,99.2f};
		
		float sum1=0f;
		for(int j=0;j<arr.length;j++)
		{
			System.out.println("Enter the value");
			arr[j]=sc.nextInt();
			sum1+=arr[j];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum is :"+sum1);
		

	}

}
