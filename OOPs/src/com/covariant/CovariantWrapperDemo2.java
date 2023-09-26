package com.covariant;

class Test {
	Number value;

	Number displayValue() {
		return value;
	}

}

class Child1 extends Test {

	Integer myVal;

	Integer displayValue() {
		myVal = 20;
		return myVal;
	}

}

// Character is not sub class of Number
// hence not allowed

// class Child2 extends Test
// {
//
//	    Character ch;
//
//	    Character displayValue()
//	    {
//	    	ch='A';
//	    	return ch;
//	    }
//
//
// }

public class CovariantWrapperDemo2 {

	public static void main(String[] args) {

		Test f = new Test();
		f.value = 89;
		System.out.println("Value is:" + f.displayValue());

		Child1 s1 = new Child1();
		System.out.println("Value is :" + (s1.displayValue() + 10));

	}
}
