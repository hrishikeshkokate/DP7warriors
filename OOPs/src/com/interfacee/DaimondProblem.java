package com.interfacee;

interface motherI {
	default void laon() {
		System.out.println("Loan taken by mother");
	}

}

interface fatherI {
	default void laon() {
		System.out.println("Loan taken by father");
	}
}

class Mother implements motherI {

	@Override
	public void laon() {
		// motherI.super.laon();
		System.out.println("child repay mother loan");
	}

}

class Father implements fatherI {

	@Override
	public void laon() {
		// fatherI.super.laon();
		System.out.println("child repay father loan");
	}

}

class Child implements motherI, fatherI {

	Mother m = new Mother();
	Father f = new Father();

	@Override
	public void laon() {
		m.laon();
		f.laon();
	}

}

public class DaimondProblem {

	public static void main(String[] args) {
		Child c = new Child();
		c.laon();

	}

}
