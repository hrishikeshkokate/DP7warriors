package com.array;
import java.util.Arrays;
public class Duplicateelement {
	static void findDuplicates(int arr[]) {
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			count = 1;
			flag = false;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arr[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, 4, 6, 3 };

		findDuplicates(arr);
		System.out.println(Arrays.toString(arr));
	}
}
