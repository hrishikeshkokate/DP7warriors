package com.basics;
import java.util.Arrays;
public class Mergerarray {
static int[] mergearray(int arr1[],int arr2[])
{
	int mar[]=new int[arr1.length+arr2.length];
	
	int i=0;
	for(int j=0;j<arr1.length;j++)
	{
		mar[i]=arr1[j];
		i++;
	}
	for(int j=0;j<arr2.length;j++)
	{
		mar[i]=arr2[j];
		i++;
	}
	return mar;
}
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4};
		int arr2[]= {11,22,33,44};
		
		int mergearray[]=mergearray(arr1, arr2);
		System.out.println(Arrays.toString(mergearray));
	}
}
