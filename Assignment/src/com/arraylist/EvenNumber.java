package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> i1=new ArrayList<>();
		//Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
//			System.out.println("Enter the number");
//			int num=sc.nextInt();
			i1.add(i);
		}
		
	
		Iterator<Integer> itr =i1.iterator();
		while(itr.hasNext())
		{
			int even=itr.next();
			if(even%2==0)
			{
				System.out.println(even);
			}
		}
	}
}
