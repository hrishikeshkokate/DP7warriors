package com.stringlogical;

import java.util.Scanner;

public class Anagram {
	static void sortarray(char ch[])
	{
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				
				if (ch[i] > ch[j]) 
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
	}
	static boolean checkanagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length())
			return false;//statuc:false
		else
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
					
					sortarray(ch1);
			sortarray(ch2);
			
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					return false;//statuc=false;break
				}
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a word 1");
		String word1=sc.next();
		
		System.out.println("Enter a word 2");
		String word2=sc.next();
		
		
		if(checkanagram(word1, word2))
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}

	}

}
