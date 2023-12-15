package com.lambda;
@FunctionalInterface
interface Movable{
	
	abstract void move();
	
	default void changeSpeed() {
		System.out.println("Speed increased..");
	}
}

public class InferfaceDemo implements Movable{

	@Override
	public void move() {
		System.out.println("Car is Moving.");
		
	}

	public static void main(String[] args) {
		
		Movable car=new InferfaceDemo();
		car.move();
		
		Movable truck=new InferfaceDemo();
		truck.move();
	}
}
