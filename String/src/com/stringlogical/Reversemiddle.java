package com.stringlogical;

public class Reversemiddle {
	static void replace(String s)
	{
		String str[] = s.split("\\s");

		String reverse = "";
		
		reverse=reverse+str[0]+" ";

		for (int i = 1; i < str.length; i++) 
		{
			for (int j = str[i].length() - 1; j >= 0; j--)
			{
				reverse = reverse + str[i].charAt(j);
			}
			reverse = reverse + " ";
		}
		reverse=reverse+str[str.length-1];
		System.out.println(reverse);
		
	}

	public static void main(String[] args) {
		String s = "I love java";
		
		replace(s);

	}

}
