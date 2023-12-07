package com.logical;

import java.util.Arrays;

public class Peterpen {
	static void frequency(char arr[]) {
		int count;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0')
				continue;
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					{
					count++;
					arr[j] = '0';
				}
			}
			if(count==1)
			{
				System.out.println("First unique letter :"+arr[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		
		String s="peter pan";
		char arr[] = s.toCharArray();
		System.out.println(Arrays.toString(arr));
		frequency(arr);

	}

}
