package com.stringlogical;

public class Mostrepeatedword {
	static void findmaxword(String str[])
	{
		int count;
		String word=" ";
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("Visited"))
			{
				continue;
			}
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count++;
					str[j]="Visited";
				}
			}
			if(count>max)
			{
				max=count;
				word=str[i];
				
			}
			
		}
		System.out.println("Most repeated word :"+word);
	}

	public static void main(String[] args) {
		
		String s="I love India because India is my country and my country is great";
		
		String str[]=s.split(" ");
		
		findmaxword(str);
		

	}


}
