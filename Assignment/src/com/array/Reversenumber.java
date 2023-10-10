package com.array;

import java.util.Arrays;

public class Reversenumber {
	static void sortdecending(int arr[]) {
		 for (int i = arr.length-1; i >= 0; i--) 
		 {  
			System.out.print(arr[i]+" ");
	     }
	}

	public static void main(String[] args) {
		int arr[] = {3, 90, 45, 29, 37, 78};
		
		sortdecending(arr);
			
	}
}
