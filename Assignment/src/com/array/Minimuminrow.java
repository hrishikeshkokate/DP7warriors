package com.array;

public class Minimuminrow {
	static void minimum(int[][] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int min=arr[i][0];
			for(int j=1;j<arr[i].length;j++)
			{
				min=arr[i][j];
			}
			System.out.println("Minimum in row " + (i + 1) + ": " + min);
		}	
	}

	public static void main(String[] args) {
		int arr[][] = {{22, 31, 9}, {16, 25, 12}};
		
		minimum(arr);

	}

}
