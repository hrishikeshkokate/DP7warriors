package com.abstractclass;

public abstract class ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="My Initial value";
		System.out.println("str 1 : "+str);
		
		str=method();
		System.out.println("str 2: "+str);
		
		int a =2;
		int b= 3;
		 int volume = volume(a, b);
		 System.out.println("Vol:"+volume);

	}
	
	
	public static String method()
	{
		return "MyString";
	}
	
	int a;
	int b;
	
	public static int volume(int a, int b) 
	{
		//this.a=a;
		//this.b=b;
		int vol = a*b;
		return vol;
		//String vol1;
		
		//return vol1;
	}
}
