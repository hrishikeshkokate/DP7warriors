package com.lab;

public class Averagefromstring 
{
	static void average(String s) 
	{
		int sum=0;
		int avg=0;
		int count=0;
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				sum+=ch[i];
				count++;
				avg=sum/count;
			}
		}
		System.out.println("Average is :"+(avg-48));//48-->ascii value of zero(0)
	}

	public static void main(String[] args) 
	{
		String s = "Sachin score 12345 runs";
		average(s);
	}
}
