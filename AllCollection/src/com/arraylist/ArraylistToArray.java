package com.arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class ArraylistToArray {

	public static void main(String[] args) {

		String colours[]= {"Red","Blue","Green","Yellow"};
		
		//convert arraylist to array
		
		ArrayList<String> a2=new ArrayList<>(Arrays.asList(colours));
		System.out.println(a2);
		
		Object [] col=a2.toArray();
		System.out.println(Arrays.toString(col));
		
		for(int i=0;i<col.length;i++)
		{
			col[i]= ((String) col[i]).concat("colours");
		}
		System.out.println(Arrays.toString(col));
		//type safety is not there
		
		//type safe
		
		String [] cols=new String[a2.size()];
		a2.toArray(cols);
		for(int i=0;i<cols.length;i++)
		{
			cols[i]= cols[i].concat("colours");
		}
		System.out.println(Arrays.toString(cols));
		

	}

}
