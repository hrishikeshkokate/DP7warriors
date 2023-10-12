package com.Stringbasics;

public class Equalscomparison {
	public static void main(String[] args) {
		
		String s1="java";//compare value for premitive
		String s2="java";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		/*________________________________________*/
		
		System.out.println("_____________________");
		
		String s3= new String("hi");
		String s4= new String("hi");
		String s5="hi";
		
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		System.out.println(s3==s4);//Compares reference
		System.out.println(s3.equals(s4));//Compares value(content)
		
		System.out.println(s3==s5);//Compares reference
		System.out.println(s3.equals(s5));//Compares value(content)
	}
}
