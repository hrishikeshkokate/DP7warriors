package com.stringlogical;

public class ReverseString {
	
	static void reverse(String st)
	{
		String reverse="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			reverse=reverse+st.charAt(i);
		}
		System.out.println("After :"+reverse);
	}

	public static void main(String[] args) {
		String st="I love java";
		System.out.println("Before :"+st);
		
		reverse(st);
		
		

	}

}
