package com.basics;

public class Alternatesum {
	static void sum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(i%2==0)
		    sum+=arr[i];
		}
		System.out.println("sum of alternate index is :"+sum);
	}

	public static void main(String[] args) {
		
		int arr[]= {1,3,5,7,9,11};
		sum(arr);


	}

}
