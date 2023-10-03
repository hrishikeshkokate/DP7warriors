package com.wrapper;

public class Demo {

	public static void main(String[] args) {
		
		int num=23;
		char c='A';
		Integer i=45;//autoboxing
		
		//convert
		Integer j=Integer.valueOf(num);
		Character k=Character.valueOf(c);
		
		float f=Float.valueOf(num);
		//coversion.auto
		System.out.println(j);
		System.out.println(k);
		System.out.println(f);

	}

}
