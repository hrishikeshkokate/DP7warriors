package com.basics;

public class Greaternumber {
	static void findgreaternum(int arr[],int max)
	{
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] > max) {
                max = arr[i];
            }
		}
		System.out.println("The maximum number is :"+max);
	}
	

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 2, 7 ,10};
		int max = 0;
		
		findgreaternum(arr,max);
		

	}

}
