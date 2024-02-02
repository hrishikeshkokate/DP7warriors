package com.revision2;

abstract class Parent {
	
	final int a=11;
	static int b=20;
	String name="Hrishikesh";
	
	abstract void show();

}

class Child extends Parent{

	@Override
	void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
		
	}
	
}

public class Demo{
	public static void main(String[] args) {
		
		Parent p=new Child();
		p.show();
		
	}
}
