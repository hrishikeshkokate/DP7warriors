package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Engine
{
	private int engineno;
	private String enginetype;
	public Engine() {
		super();
		
	}
	public Engine(int engineno, String enginetype) {
		super();
		this.engineno = engineno;
		this.enginetype = enginetype;
	}
	public int getEngineno() {
		return engineno;
	}
	public void setEngineno(int engineno) {
		this.engineno = engineno;
	}
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}
	@Override
	public String toString() {
		return "Engine [engineno=" + engineno + ", enginetype=" + enginetype + "]";
	}
	
	
	
}
class Car implements Comparable<Car>
{
	private int modelNumber;
	private String colour;
	private double price;
	private Engine engine;
	public Car() {
		super();
		
	}
	public Car(int modelNumber, String colour,double price, Engine engine) {
		super();
		this.modelNumber = modelNumber;
		this.colour = colour;
		this.price=price;
		this.engine = engine;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [modelNumber=" + modelNumber + ", colour=" + colour + ", price=" + price + ", engine=" + engine
				+ "]";
	}
	@Override
	public int compareTo(Car c) {
		if(this.getEngine().getEnginetype().compareTo(c.getEngine().getEnginetype())==0)
		if(this.getPrice()<c.getPrice())
			return 1;
		else if(this.getPrice()>c.getPrice())
			return -1;
		else
			return 0;
		else
		
		return this.getEngine().getEnginetype().compareTo(c.getEngine().getEnginetype());
	}
}

public class ShowRoom {
	
	static void giveDiscount(ArrayList<Car> it)
	{
		for (Car c:it) 
		{
			if(c.getPrice()>100000)
			{
			double price=c.getPrice()-(c.getPrice()*0.05);
				c.setPrice(price);
			}
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Car> c1=new ArrayList<>();
		
		c1.add(new Car(2022,"Blue",1000000,new Engine(12345,"Automatic")));
		c1.add(new Car(1998,"Red",2500000,new Engine(99999,"Manual")));
		c1.add(new Car(2005,"Green",600000,new Engine(85642,"Manual")));
		c1.add(new Car(1967,"White",5500000,new Engine(98745,"Automatic")));
		c1.add(new Car(2015,"Black",4560000,new Engine(63245,"Manual")));
		
		ArrayList<Car> auto=new ArrayList<>();
		ArrayList<Car> manual=new ArrayList<>();
		
		for(Car c:c1 )
		{
			System.out.println(c);
		}
		System.out.println("--------------------------");
		
		for(Car c:c1 )
		{
			if(c.getEngine().getEnginetype().equals("Automatic"))
			{
				auto.add(c);
			}
			else
			{
				manual.add(c);
			}
		}
		System.out.println("--------------------------");
		for(Car c:auto)
		{
			System.out.println(c);
		}
		System.out.println("--------------------------");
		for(Car c:manual)
		{
			System.out.println(c);
		}
		
		
		System.out.println("--------------------------");
		
		giveDiscount(c1);
		Iterator<Car> itr=c1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------------------");
		Collections.sort(c1);
		for(Car c:c1)
		{
			System.out.println(c);
		}
		
		System.out.println("--------------------------");
		
		Collections.sort(c1,new ColourComparator());
		System.out.println(c1);
		
		System.out.println("--------------------------");
		
		//removeCar
		Iterator<Car> itr1=c1.iterator();
		while(itr1.hasNext())
		{
			if(itr1.next().getEngine().getEnginetype().equals("Manual"))
			{
				itr1.remove();
			}
		}
		for(Car c:c1)
		{
			System.out.println(c);
		}
	
	}
}
