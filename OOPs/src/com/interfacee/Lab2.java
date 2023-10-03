package com.interfacee;

interface Engine 
{
	void condition();
}

interface Vehicle
{
	void start();
}

class Car3 implements Engine, Vehicle 
{
	private String engineCondition;

	public Car3(String engineCondition) 
	{
		this.engineCondition = engineCondition;
	}

	@Override
	public void condition() 
	{
		System.out.println("Engine is in " + engineCondition + " condition.");
	}

	@Override
	public void start() 
	{
		System.out.println("Car has started.");
	}
}

class Supercar extends Car3 implements Engine, Vehicle
{
	private String superCarFeature;

	public Supercar(String engineCondition, String superCarFeature) 
	{
		super(engineCondition);
		this.superCarFeature = superCarFeature;
	}

	public void showSuperCarFeature()
	{
		System.out.println("SuperCar feature: " + superCarFeature);
	}
}

public class Lab2 {
	public static void main(String[] args) {
		Supercar supercar = new Supercar("excellent", "Turbocharged Engine");

		supercar.start();
		supercar.condition();
		supercar.showSuperCarFeature();
	}
}
