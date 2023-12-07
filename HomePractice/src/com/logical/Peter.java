package com.logical;

public class Peter {

	static void same(char arr[]) {
		char count;
		for (char i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1)
			{
				System.out.println("First unique letter: "+arr[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		String s = "peter pan";
		char arr[] = s.toCharArray();
		same(arr);
	}
}
