package com.basics;

public class Findpairs {
	static void pairs(int arr[],int num)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				continue;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==num)
				{
					System.out.println(num+" = "+arr[i]+" + "+arr[j] );
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int num=7;
		pairs(arr, num);
	}
}
