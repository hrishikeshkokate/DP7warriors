package com.revision;

public class Ascendingornot {
	
	static void ascending(String s) {
		boolean flag=true;
		
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					flag=false;
				}
			}
		}
		if(flag==true) {
			System.out.println("Ascending order");
		}
		else {
			System.out.println("not in ascending order");
		}
	}

	public static void main(String[] args) {
		String s="accent";
		ascending(s);
	}
}
