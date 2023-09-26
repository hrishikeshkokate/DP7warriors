package com.wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		
		//Autoboxing
		//primitive to wrapper class
		//method :valueof
		
		int num=23;
		Integer i=new Integer(45);
		
		//convert
		Integer j=Integer.valueOf(num);
		//coversion.auto
		
		Integer k=num;
		System.out.println(num+""+i+" "+j+" "+k);
		
		//unboxing
		//wrapping to primitve
		//intvalue
		
		Float f1=new Float(23.4f);
		
		float f2=f1.floatValue();
		///unboxing = auto
		
		float f3=f1;
		
		System.out.println(f1+" "+f2+" "+f3);
	}

}
