package com.lab;

public class StringContainNumber {

	public static void main(String[] args) {
		String arr[] = { "c", "0java", "3angular", "python" };

		for (int i = 0; i < arr.length; i++) 
		{
			 //char ch[]=arr[i].toCharArray();

			 //for(int j=0;j<ch.length;j++)
			for (int j = 0; j < arr[i].length(); j++) 
			{
				try
				{
					 //if (ch[i]>=48 && ch[i]<=57)
					if (arr[i].charAt(j) >= '0' && arr[i].charAt(j) <= '9') 
					{
						throw new InvalidStringException("String contain number ");
					}
					System.out.println(arr[i]);
				} 
				catch (InvalidStringException e) 
				{
					System.out.println(e.toString());
				}
				break;
			}
		}
	}
}
