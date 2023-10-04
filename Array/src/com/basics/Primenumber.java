package com.basics;
import java.util.Scanner;
public class Primenumber {
	static void prime(int arr[],int count,int n)
	{
	for (int j = 2; j <arr.length; j++) {
		count = 0;
		for (int i = 1; i <arr.length; i++) {
			if (j % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println(j + "  ");
	}
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the value");
			arr[i]=sc.nextInt();
		}
		int count=0;
		
		prime(arr, count, n);
	}
}
