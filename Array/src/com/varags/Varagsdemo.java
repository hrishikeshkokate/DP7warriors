package com.varags;

public class Varagsdemo {
	static void demo(int ...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum+=i;
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		demo(2,3,5,4);
		demo(5,8);

	}

}
