package com.twodarray;

public class MaxMinincolumn2d {
	static void min(int arr[][])
	{
		for(int j=0;j<3;j++)
		{
			int min=Integer.MAX_VALUE;
			for(int i=0;i<2;i++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
				
			}
			System.out.println("Minimum in column " + (j + 1)+": " +min);
		}
	}
	
	{
		
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };
		min(arr);

	}

}
