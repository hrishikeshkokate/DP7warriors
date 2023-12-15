package com.lambda;

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		//Movable car=()->{};
		
		Movable car=()->{
			System.out.println("Car is Moving");
			};
		car.move();
		
		Movable ball=()->{
			System.out.println("Ball is Rolling");
			};
		ball.move();
	}

}
