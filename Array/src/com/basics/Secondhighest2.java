package com.basics;

public class Secondhighest2 {
	static void highest(int arr[])
	{
		int high=Integer.MIN_VALUE;
		int secondhigh=Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>high)
			{
				secondhigh=high;
				high=arr[i];
			}
			else if(arr[i]>secondhigh)
			{
				secondhigh=arr[i];
			}
		}
		System.out.println("Second highest number :"+secondhigh);
	}
	public static void main(String[] args) {
		int arr[]= {6,7,10,2,4,9,5,12};
		highest(arr);
	}
}
