package com.lambda;

public class AnonymousInner {
	
	public static void main(String[] args) {
		
		Movable car=new Movable() {
			
			@Override
			public void move() {
				System.out.println("Car is Moving");
				
			}
		};
		
		Movable ball=new Movable() {
			
			@Override
			public void move() {
				System.out.println("Ball is Rolling");
				
			}
		};
		
		car.move();
		ball.move();
	}

}
