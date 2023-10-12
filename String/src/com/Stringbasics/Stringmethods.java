package com.Stringbasics;

public class Stringmethods {

	public static void main(String[] args) {

		// In String length is method
		// In array it is property

		String str = "java";
		System.out.println(str.length());// 4
		// it will count space also

		System.out.println("_______________");
		// charAt

		System.out.println(str.charAt(1));// a

		System.out.println(str.charAt(str.length() - 1));// a(last letter)
		// 4-1=3
		// j a v a
		// 0 1 2 3
		// 3=a.
		System.out.println("_______________");
		// concat , +

		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));

		System.out.println("_______________");
		// substring
		// part of string

		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 4));// print from 1 to 5

		System.out.println("_______________");
		// conatins

		System.out.println(str.contains("ava"));// true(java conatins ava)
		System.out.println(str.contains("orl"));// false

		System.out.println("_______________");
		// ignore

		String w1 = "hi";
		String w2 = "Hi";

		System.out.println(w1 == w2);// false
		System.out.println(w1.equals(w2));// false

		System.out.println(w1.equalsIgnoreCase(w2));// true

		System.out.println("_______________");
		// upper case

		System.out.println(str.toLowerCase());// java

		System.out.println(str.toUpperCase());// JAVA

		System.out.println("_______________");
		// indexof, lastindex of

		System.out.println(str.indexOf('a'));// 1
		System.out.println(str.lastIndexOf('a'));// 3

		System.out.println(str.indexOf("fun"));// -1

		System.out.println("_______________");
		// is empty

		System.out.println(str.isEmpty());

		String s = "";
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());

		System.out.println("_______________");
		// trim

		String s5 = " Hrishi ";
		System.out.println(s5.length());
		System.out.println(s5.trim());// delete spaces from first and
										// last not from between

		System.out.println("_______________");
		// Compare to= return int
		// equal: boolean= true/false

		System.out.println("Hrishikesh".compareTo("Hrishikesh"));

		System.out.println("Megha".compareTo("Neetu"));

		System.out.println("Neetu".compareTo("Megha"));

		System.out.println("Megha".compareTo("Parul"));

		// positive if 1st ascii char is greater
		// negative id 1st ascii is similar
		// same=0

		// lexographical comparison
		System.out.println("_______________");

		String a1 = "java";
		String a2 = "python";

		System.out.println(a1.length() > a2.length());

		System.out.println(a1.compareTo(a2));

		System.out.println(a1.compareTo(a2) > 0);

	}

}
