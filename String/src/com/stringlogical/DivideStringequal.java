package com.stringlogical;

import java.util.Arrays;

public class DivideStringequal {
	
	static void divideString(String s,int noOfc)
	{
		int len=s.length();
		
		//number of substring
		int n=len/noOfc;
		
		String spltstr[]=new String[n];
		
		int index=0;
		
		for(int i=0;i<len;i+=noOfc)
		{
			spltstr[index]=s.substring(i, i+noOfc);
			index++;
		}
		System.out.println(Arrays.toString(spltstr));
	}

	public static void main(String[] args) {
		String st[] = {"I","love","to","learn","java"};
		
		int noOfc=2;
		
		String s=String.join("", st);
		
		divideString(s, noOfc);
		
	}
}
