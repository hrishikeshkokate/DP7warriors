package com.lab;

import java.util.Arrays;

public class InitialName {

		static void firstletter(String s) 
		{
			String str[] = s.split("\\s");
			String s1="";

			for (int i = 0; i < str.length; i++) 
			{
				if(i==str.length-1)
				{
					s1+=str[i];
				}
				else
				{
					char ch=str[i].charAt(0);
					s1+=ch+".";
				}
			}
			System.out.println(s1);
		}

		public static void main(String[] args) {
			String s = "Hrishikesh Dipak Kokate";

			firstletter(s);
		}
	}


