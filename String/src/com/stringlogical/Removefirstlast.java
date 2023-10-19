package com.stringlogical;

public class Removefirstlast {
	static void removeusingmethod(String s)
	{
		s=s.substring(1, s.length()-1);
		
		System.out.println(s);
		
	}
	static void withoutmethod(String s)
	{
		
		char ch[]=s.toCharArray();
		
		char result[]=new char[ch.length];
		
		for(int i=1;i<ch.length-1;i++)
		{
			result[i-1]=ch[i];
		}
		
		String newstring=new String(result);
		System.out.println(newstring);
		
	}

	public static void main(String[] args) 
	{
		String s = "Hello world";
		//removeusingmethod(s);
		withoutmethod(s);

	}

}
