package com.basics;

public class ShortHand {

	public static void main(String[] args) {
		byte  b1=70;
		byte b2=80;
		
		//byte b1=b1+b2; //for this we have to use casting, need to add (byte)
		 b1=(byte)(b1+b2);
		
		System.out.println(b1);
		
		byte num1=23;
		byte num2=44;
		
		//num1=num1+num2;
		
		num1+=num2; //removes type casting issues
		System.out.println(num1);
		
		short s1=67;
		short s2=2;
		
		//s1=s1+s2;
		
		s1+=s2;
		System.out.println(s1);
		
		char c1=65; //it will print ascii value of 65 which is A
		char c2='9'; // it will print 9
		// if 
		int a=c2; //it will print ascii value of 9 which is 57
		//char a=c2; it will print 9
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(a);
		
		
	}

}
