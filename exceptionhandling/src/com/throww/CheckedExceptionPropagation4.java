package com.throww;

public class CheckedExceptionPropagation4 {
	
	
	void method1() throws ClassNotFoundException
	{		
		throw new ClassNotFoundException("Class error");
		
	}
	
	void method2() throws ClassNotFoundException
	{
		method1();
	}
	
	void method3() throws ClassNotFoundException 
	{
	
		method2();
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException  {
		
		CheckedExceptionPropagation4 obj1= new CheckedExceptionPropagation4();
		obj1.method3();
		
	}

}