package com.stringlogical;

public class Secondoccurance {
	static void display(String s) {
		String substring = "a";

		int firstocc = s.indexOf(substring);
		//System.out.println("firstocc "+firstocc);

		if (firstocc != -1) 
		{
			int secondocc = s.indexOf(substring, firstocc + 1);
			//System.out.println("secondocc "+secondocc);

			if (secondocc != -1) 
			{
				System.out.println("Second occurrence of \"" + substring + "\" is at index " + secondocc);
			} 
			else 
			{
				System.out.println("No second occurrence found");
			}
		} 
		else 
		{
			System.out.println("No first occurrence found");
		}
		
	}
	public static void main(String[] args) {

		String s = "Java programming";

		display(s);
	}
}
