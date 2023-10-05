package com.arraylab;

import java.util.Arrays;
public class firstlastaddarray {
	static void firstlastaddarray(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length/2;i++)
		{
			sum=arr[i]+arr[arr.length-1-i];
			System.out.println("Sum :"+sum);
		}
		
	}
    public static void main(String[] args) {
    	int arr[] = { 1, 5, 7, 3, 8, 9, 2 ,8};
    	
    	firstlastaddarray(arr);
}
}
