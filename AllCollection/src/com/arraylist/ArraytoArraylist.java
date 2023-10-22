package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoArraylist {

	public static void main(String[] args) {
		
		//convert array to array list
		
		String colours[]= {"Red","Blue","Green","Yellow"};
		
//		Arrays.sort(colours);
//		
//		System.out.println(Arrays.toString(colours));
		
		//1st way
		
		List<String> a1=Arrays.asList(colours);
		System.out.println(a1);
		
		//2nd way
		
		ArrayList<String> a2=new ArrayList<>(Arrays.asList(colours));
		System.out.println(a2);
		
		//3rd way
		
		ArrayList<String> a3=new ArrayList<>();
		Collections.addAll(a3, colours);
		System.out.println(a3);

	}

}
