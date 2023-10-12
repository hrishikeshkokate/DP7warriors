package com.stringlogical;

import java.util.Scanner;

public class Replaceduplicat$ {
	static String replace(String s) 
	{
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) 
		{
			for (int j = i + 1; j < ch.length; j++) 
			{
				if (ch[i] == ch[j]) 
				{
					ch[j] = '$';
				}
			}
		}
		s = new String(ch);
		return s;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word");
		String word1 = sc.next();

		replace(word1);

	}

}
