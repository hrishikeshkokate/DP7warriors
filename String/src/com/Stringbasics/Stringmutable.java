package com.Stringbasics;

public class Stringmutable {
	public static void main(String[] args) {

		String s1 = "java";

		System.out.println(s1.hashCode());// different hashcode 3254818
		s1 = "corejava";

		System.out.println(s1.hashCode());// different hashcode -466521535
		System.out.println(s1);

		String s2 = "Hrishikesh";
		System.out.println(s2.hashCode());// same hashcode -782559612
		s2.concat("Kokate");// "Hrishikesh".concar"kokate"
		System.out.println(s2.hashCode());// same hashcode -782559612
		System.out.println(s2);

		String s3 = "Hrishikesh";
		System.out.println(s3.hashCode());// same hashcode -782559612
		s3 = s3.concat(" Kokate");
		System.out.println(s3.hashCode());// different hashcode -1221400241
		System.out.println(s3);

		String s4 = "Hrishikesh kokate";
		System.out.println(s4.hashCode());// different hashcode 1172803271
	}
}
