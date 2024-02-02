package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayfromuser {

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
		System.out.println(arr);//prints hashcode
		
		System.out.println(Arrays.toString(arr));

	}

}
