package com.lab;

public class Makespaceright {
	static void makeequalspace(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			s=s.replaceAll("  ", " ");
		}
		System.out.println(s.replaceAll(" "," "));
		
	}

	public static void main(String[] args) {
		
		String s= "I am  hrishikesh   kokate";
		
		makeequalspace(s);

	}

}
