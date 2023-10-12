package com.stringlogical;

public class EncodeString {

	static void encode(String str)
	{
		// string to char array
		char ch[]= str.toCharArray();
		System.out.println(ch);
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]++;  // ch[i]= ch[i]+1
		}
		
		System.out.println(str);
		
		System.out.println(ch);
		
	   str=new String(ch);
	   
	   System.out.println(str);
	   
	   
		
	}
	
	public static void main(String[] args) {
		
		String s1="Java";
		
		encode(s1);
		
	}

}
