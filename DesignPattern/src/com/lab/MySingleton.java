package com.lab;

public class MySingleton {
	
	private static MySingleton obj=new MySingleton();
	
	String msg;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getObject() {
	return obj;	
	}
	public static void main(String[] args) {
		
		MySingleton ms1=MySingleton.getObject();
		ms1.msg="Java";
		MySingleton ms2=MySingleton.getObject();
		ms1.msg="Angular";
		MySingleton ms3=MySingleton.getObject();
		ms1.msg="JavaScript";
		
		System.out.println(ms2.msg);
		
	}
}
