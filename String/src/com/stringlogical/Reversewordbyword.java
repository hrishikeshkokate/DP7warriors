package com.stringlogical;

public class Reversewordbyword {
	static void reverseword(String s) 
	{
		String str[] = s.split("\\s");

		String reverse = "";

		for (int i = 0; i < str.length; i++) 
		{
			for (int j = str[i].length() - 1; j >= 0; j--)
			{
				reverse = reverse + str[i].charAt(j);
			}
			reverse = reverse + " ";
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) 
	{
		String s = "I love java";
		reverseword(s);
	}
}
