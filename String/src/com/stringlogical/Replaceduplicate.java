package com.stringlogical;

import java.util.Scanner;

public class Replaceduplicate {

	static String replaceDup(String st)
	{
		for(int i=0;i<st.length();i++)
		{
			for(int j=i+1;j<st.length();j++)
			{
				if(st.charAt(i)==st.charAt(j))
				{
					//System.out.println(j);
					st=st.replace(st.charAt(j), '$');
				}
			}
		}
		return st;
	}
	
	public static void main(String[] args) {
       
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a word1:");
		
		String word= sc.next();
		
		System.out.println("Original word:"+word);
		
		word=replaceDup(word);
		
		System.out.println("New word:"+word);
		
		
	}

}

