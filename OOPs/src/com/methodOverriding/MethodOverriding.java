package com.methodOverriding;

class Person {
	void display() {
		System.out.println("I am person");

	}
}
class Employee extends Person{
	@Override
	void display() {
		System.out.println("I am employee");
	}
}
class Celebrity extends Person{
	@Override
	void display() {
		System.out.println("I am celebrity");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Person p1=new Person();
		Employee e1=new Employee();
		Celebrity c1=new Celebrity();
		p1.display();
		e1.display();
		c1.display();
	}

}
