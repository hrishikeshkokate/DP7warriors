package com.basics;
import java.util.Scanner;
public class CarSpeed {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Distance covered");
		int dis=sc.nextInt();
		System.out.println("Time taken");
		int time=sc.nextInt();
		
		int speed=dis/time;
		
		System.out.println("speed of car is :"+speed+"km/hr");
		sc.close();
	}

}
