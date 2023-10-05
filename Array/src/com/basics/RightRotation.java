package com.basics;

import java.util.Arrays;

public class RightRotation {
	static void rotate(int arr[])
	{
		int last=arr[arr.length-1];//last element is stored first
		for(int i=arr.length-1;i>0;i--)//shifted from last to first
		{
				arr[i]=arr[i-1];
		}
		arr[0]=last;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=2;//number of shift
		for(int j=0;j<n;j++)
		{
		rotate(arr);
		}
		System.out.println(Arrays.toString(arr));

	}

}
