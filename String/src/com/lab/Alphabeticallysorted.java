package com.lab;

import java.util.Scanner;

public class Alphabeticallysorted {
	static void sort(String s)
	{
		char ch[]=s.toCharArray();
		boolean flag=true;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					flag=false;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("Alphabetical order");
		}
		else
		{
			System.out.println("Not alphabetical order");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word :");
		String s=sc.next();
		sort(s);
	}
}
