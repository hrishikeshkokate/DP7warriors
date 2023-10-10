package com.arraylab;

import java.util.Arrays;

public class Abcd {
	static void shift(char arr[]) {

		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] <= 'c') //(arr[i]<121) 121=y
			{
				arr[i] += 2; //arr[i]+=2;
			}
				else if(arr[i] > 'y') //(arr[i]>120 && arr[i]<123) 120=x, 123={
				{
					arr[i] -= 24;	//arr[i]-=24;
				}
			}
		System.out.println(Arrays.toString(arr));
		}
		
	public static void main(String[] args) {

		char arr[] = { 'a', 'b', 'c', 'y', 'z' };

		shift(arr);
	}
}
