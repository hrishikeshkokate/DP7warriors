package com.basics;

public class Divisible3and5 {
	
	static void divisible(int arr[],int sum )
	{
		for(int i:arr)
		{
			if((i%3==0) && (i%5==0))
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 ,8,9,10};
		int sum=0;
		divisible(arr,sum);
		

	}

}
