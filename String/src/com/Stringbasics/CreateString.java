package com.Stringbasics;

public class CreateString {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";

		System.out.println(s1.hashCode());// 3254818
		System.out.println(s2.hashCode());// 3254818

		String str1 = new String("Hello");
		String str2 = new String("Hello");// storing the reference

		System.out.println("_____________");

		System.out.println(str1.hashCode());// 69609650
		System.out.println(str2.hashCode());// 69609650//hashcode of object
        
		
	}

}
