package com.lab;

import java.util.Scanner;

public class AlphabeticallySortedString {
	static void sort(String s) {
		boolean flag = true;
		
		for (int k =1 ; k < s.length(); k++)
		{
			String str[] = s.split(s);

			for (int a = 0; a < s.length(); a++) 
			{
				char ch[] = s.toCharArray();
				for (int i = 0; i < ch.length; i++) 
				{
					for (int j = i + 1; j < ch.length; j++) 
					{
						if (ch[i] > ch[j]) 
						{
							flag = false;
						}
					}
				}
			}
		}
		if (flag == true) {
			System.out.println("Alphabetical order");
		} else {
			System.out.println("Not alphabetical order");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence :");
		String s = sc.next();
		sort(s);
	}

}
