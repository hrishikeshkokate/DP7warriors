package com.arraylab;
import java.util.Arrays;
public class Newsortevenodd {
	static void arrange(int arr[]) {
		int arr1[]=new int [arr.length];
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] % 2 == 0)     //2 4 6 8 0
			{
				arr1[count]=arr[i];  //0 1 2 3 
				count++;             //1 2 3 4 
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 != 0) {
				arr1[count]=arr[i];
				count++;
			}
		}
		System.out.println("After :"+Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		int arr[] = { 2, 4, 1, 3, 6, 9, 8, 7 };
		System.out.println("Before :"+Arrays.toString(arr));
		arrange(arr);
	}
}
