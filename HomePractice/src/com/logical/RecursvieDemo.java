package com.logical;

public class RecursvieDemo {
	static int sum(int num)
	{
		if(num<=0)
			return 0;
		
		else
		{
			return num +sum(num-1);
		}
		
	}
	

	public static void main(String[] args) {
		int n=10;
		System.out.println(sum(n));
		//sum(n);

	}

}
