package com.array;

public class Commonelement {
	static void common(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int arr1[] = {12, 23, 34, 67 ,78, 91, 56};
		int arr2[] = {39, 25, 15, 23, 55, 91, 66, 22};
		
		common(arr1, arr2);

	}

}
