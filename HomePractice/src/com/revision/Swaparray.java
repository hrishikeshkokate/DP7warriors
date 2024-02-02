package com.revision;

import java.util.Arrays;

public class Swaparray {
	
	static void evenodd(int[] arr) {
		
		int arr1[]=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr1[index++]=arr[i];
			}
		}for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				arr1[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
	
	static void withoutsecondarray(int []arr) {
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			if(arr[i]%2==0) {
				 temp=arr[i];
				 arr[j]=arr[i];
				 arr[i]=temp;
				
			}
			if(arr[i]%2!=0) {
				 temp=arr[i];
				 arr[j]=arr[i];
				 arr[i]=temp;
				
			}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}
	

	public static void main(String[] args) {
		int arr[]= {1,2,5,4,3,9,7};
		
		evenodd(arr);
		//withoutsecondarray(arr);

	}

}
