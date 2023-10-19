package com.lab;

public class Demo {

	public static void main(String[] args) 
	{
		String s[] = { "c", "java", "angular", "python" };

		for (int i = 0; i < s.length; i++)
		{
			try
			{
				if (s[i].length() < 3) 
				{
					throw new InvalidStringException("char length should be more than 3 :"+s[i]);
				}
				System.out.println(s[i]);
			}
			catch (Exception e) 
			{
				//e.getMessage();
				//e.printStackTrace();
				System.out.println(e.toString());
				
			}
		}
	}
}
