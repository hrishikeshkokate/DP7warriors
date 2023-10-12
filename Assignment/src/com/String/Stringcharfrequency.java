package com.String;

import java.util.Arrays;

public class Stringcharfrequency {
	static void frequency(char ch[])
	{
		boolean flag=false;
		int count=0;
		
		for(int i=0;i<ch.length-1;i++)
		{
			count=1;
			flag=false;
			for(int j=i-1;j>=0;j--)
			{
				if(ch[i]==ch[j])
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				for(int k=i+1;k<ch.length;k++)
				{
					if(ch[i]==ch[k])
					{
						count++;
					}
				}
				System.out.println(ch[i]+"-->"+count);
//				if(count==1)
//				{
//					System.out.println("Unique character :"+ch[i]);
//				}
//				else
//				{
//					System.out.println("Duplicate character :"+ch[i]);
//				}
			}
			
		}
	}

	public static void main(String[] args) {
		
		String s="Hrishikesh";
		
		char ch[]=s.toCharArray();
		
		frequency(ch);
		System.out.println(Arrays.toString(ch));
		

	}

}
