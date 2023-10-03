package com.array;

public class Average {
	static void avg(int arr1[],int sum)
	{
		int a=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum+=arr1[i];
			a=sum/arr1.length;
			
		}
		System.out.println("Average of array is :"+a);
	}

	public static void main(String[] args) {
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
		int sum=0;
		avg(arr1,sum);
		
	}

}
