package com.basics;

public class Maximumcharacter {
	static char max(char arr[],char c)
	{
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i] > c) {
                c = arr[i];
            }
		}
		//System.out.println("The maximum character is :"+c);
		return c;
	}

	public static void main(String[] args) {
		char arr[]= {'a','g','c','e'};
		char c='a';
		
		char maxChar = max(arr, c);
        System.out.println("The maximum character is: " + maxChar);

	}

}
