package com.lab;

public class Firstlettercapitalstring {
	static void makefirstcapital(String s) 
	{
		String str[] = s.split("\\s");

		for (int i = 0; i < str.length; i++) 
		{
			char ch[] = str[i].toCharArray();

			for (int j = 0; j < ch.length; j++) 
			{
				if (ch[0] >= 'a' && ch[0] <= 'z') 
				{
					ch[0] -= 32;
				}
				System.out.print(ch[j] + "");
			}
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		String s = "india is a beautiful country";

		makefirstcapital(s);
	}
}
