package com.twodarray;

public class Shuffle2d {
	
	static void transposeArray(int arr[][])
	{

		for(int j=0;j<3;j++)
		{
			for(int i=0;i<2;i++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		int arr[][] = { { 22, 31, 9 }, 
				        { 12, 25, 16} }; 
		transposeArray(arr);

	}

}
