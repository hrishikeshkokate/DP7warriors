package com.stringlogical;

import java.util.Arrays;

public class Sortlexograpgically {
	static void sort(String st[]) {
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].compareTo(st[j]) > 0) {
					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
	}
	static void sortlength(String st[]) {
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].length()>(st[j].length()) ) {
					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
	}

	static void sortlengthlexo(String str[])
	{
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				
				if(str[i].length()==(str[j].length()))
				{
					if(str[i].compareTo(str[j])>0)
					{
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
					}
					
				}
				else 
					{
					if(str[i].length()>(str[j].length()))
					
				{
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
				}
				}
			}
		}
	

	public static void main(String[] args) {

		String str[] = { "java", "python", "sql", "cpp", "c", "angular", "html","devops" };
		//System.out.println("Before :" + Arrays.toString(str));

		//sort(str);

		//System.out.println("Lexo :" + Arrays.toString(str));
		
		sortlengthlexo(str);
		//sortlength(str);
		
		System.out.println("Length :"+Arrays.toString(str));

	}

}
