package com.twodarray;

public class MaxMininrows2d {
	static void max(int arr[][]) {
		
		for (int i = 0; i < 2; i++) 
		{
			int max=Integer.MIN_VALUE;
			for (int j = 0; j < 3; j++) 
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
			System.out.println("Maximum in row " + (i + 1)+": " + max);
		}
	}
	
	static void min(int arr[][])
	{
		for(int i=0;i<2;i++)
		{
			int min=Integer.MAX_VALUE;
			for(int j=0;j<3;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
			System.out.println("Minimum in row " + (i + 1)+": " +min);
		}
		
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };

		max(arr);
		System.out.println("_____________________");
		min(arr);

	}

}
