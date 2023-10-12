package com.arraylab;

public class RemoveDuplicate {
	static void remove(String s)
	{
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='\0')
			{
				continue;
			}
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='\0';
				}
			}
			System.out.println(ch[i]);
		}
	}
	public static void main(String[] args) {
	
		String s="Hrishikesh";
		
		remove(s);
	}
}
