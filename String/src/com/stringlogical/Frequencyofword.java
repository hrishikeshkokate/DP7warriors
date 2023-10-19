package com.stringlogical;

public class Frequencyofword {
	
	static void findmaxword(String str[])
	{
		int count;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("Visited"))
			{
				continue;
			}
			count=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					str[j]="Visited";
				}
			}
			System.out.println(str[i]+"-->"+count);
			
		}
	}

	public static void main(String[] args) {
		
		String s="I love India because India is my country and my country is great";
		
		String str[]=s.split(" ");
		
		findmaxword(str);
		

	}

}
