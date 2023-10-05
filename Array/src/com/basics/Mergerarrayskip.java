package com.basics;

import java.util.Arrays;

public class Mergerarrayskip {
	
		static int[] mergearray(int arr1[],int arr2[])
		{
			int mar[]=new int[arr1.length+arr2.length];
			
			int index=0;
			
			int maxlength=Math.max(arr1.length,arr2.length);
			
			for(int i=0;i<maxlength;i++)
			{
				if(i<arr1.length)
				{
					mar[index]=arr1[i];
					index++;
				}
				if(i<arr2.length)
				{
					mar[index]=arr2[i];
					index++;
				}
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
