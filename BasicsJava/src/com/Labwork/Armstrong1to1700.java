package com.Labwork;

public class Armstrong1to1700 {
	static void armStrong(int num)
	{
		int num1=num;
		int num2=num;
		int count=0;
		while(num!=0)
		{
			num/=0;
			count++;
		}
		int sum=0;
		while(num1!=0)
		{
			int value=1;
			int rem=num%10;
			for(int i=1;i<=count;i++)
			{
				value*=rem;
			}
			sum+=value;
			num1/=10;
			
		}
		
	}

	public static void main(String[] args) {
		

	}

}
