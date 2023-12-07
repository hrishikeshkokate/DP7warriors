package com.logical;

public class Hihello {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			if(i%9==0)
			{
				System.out.println("HELLO");
			}
			else if(i%3==0)
			{
				System.out.println("HII");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
