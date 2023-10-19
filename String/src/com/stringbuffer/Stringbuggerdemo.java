package com.stringbuffer;

public class Stringbuggerdemo {

	public static void main(String[] args) {


		StringBuffer st=new StringBuffer(5);
		System.out.println(st.capacity());
		
		StringBuffer st1=new StringBuffer("Hello");
		System.out.println(st1.capacity());//16+5=21
		
		StringBuffer st2=new StringBuffer();
		System.out.println(st2.capacity());//default
		
		
		
		

	}

}
