package com.singleton;

public class SingleTonDemo {
	
	//rule1: static member to create instance
	
	//private static SingleTonDemo obj; // lazy
	
	private static SingleTonDemo obj=new SingleTonDemo(); //early
	
	public String msg;
	
	//rul2: private constructor
	
	private SingleTonDemo() {
		msg="Welcome";
	}
	
	//rule3: public static method to return the instance
	
	public static SingleTonDemo getInstance() {
		if(obj==null) 
			new SingleTonDemo(); //lazy initialization
			
		return obj;
		
	}
	
	public static void main(String[] args) {
		
		SingleTonDemo s1=SingleTonDemo.getInstance();
		SingleTonDemo s2=SingleTonDemo.getInstance();
		SingleTonDemo s3=SingleTonDemo.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		s1.msg="Hello";
		
		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);
	}

}
