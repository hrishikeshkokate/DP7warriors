package com.lab;

import java.util.Scanner;

public class MethodCalling 
{
	static void showUser(int id,String password)
	{
		System.out.println("id is..."+id);
		System.out.println("password is..."+password);
	}
static void print()
{
int i=1;
while(i<=5)
{
System.out.println("i="+i);	
}
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		showUser(0, null);
		print();

	}

}
