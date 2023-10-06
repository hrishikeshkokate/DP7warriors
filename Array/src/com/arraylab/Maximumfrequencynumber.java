package com.arraylab;
import java.util.Arrays;

public class Maximumfrequencynumber {
	static void maximun(int arr[]) {
		int temp =  arr[0];
		int max=0;
		
		boolean visited;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			visited = false;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						count++;
					}
				}
				if (count > max) {
                    max = count;
                    temp = arr[i];
                }
			}
		
		}
		 System.out.println("Maximum frequency number: " + temp);
	     System.out.println("Frequency count: " + max);
		
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1,2, 1, 3, 4, 2,2 ,7,7,7,7};
		maximun(arr);
	}
}
