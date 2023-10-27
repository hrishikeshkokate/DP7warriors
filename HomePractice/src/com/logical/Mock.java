package com.logical;

import java.util.Scanner;

public class Mock {

	public static void main(String[] args) {
		String s="India is a great nation";
		
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			char ch[]=str[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
		}

	}

}
