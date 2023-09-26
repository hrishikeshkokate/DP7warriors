package com.lab;

class Engine
{
	private String enginetype;
	private int price;
	
	Engine()
	{
		
	}
	Engine(String enginetype,int price)
	{
		this.enginetype=enginetype;
		this.price=price;
		
	}
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "\n\nEngine information:\nenginetype=" + enginetype + " \nprice=" + price;
	}
	
}
class Machine
{
	private String machinetype;
	private Engine engine;
	
	Machine()
	{
		
	}
	Machine(String machinetype,Engine engine)
	{
		this.machinetype=machinetype;
		this.engine=engine;
		
	}
	public String getMachinetype() {
		return machinetype;
	}
	public void setMachinetype(String machinetype) {
		this.machinetype = machinetype;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String toString() {
		return "\n\nMachine information:\nmachinetype=" + machinetype +  engine;
	}
	
}
class Car
{
	private int modelno;
	private String cname;
	private Machine machine;
	
	Car()
	{
		
	}
	Car(int modelno,String cname,Machine machine)
	{
		this.modelno=modelno;
		this.cname=cname;
		this.machine=machine;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Machine getMachine() {
		return machine;
	}
	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	public String toString() {
		return "\nCar information:\nmodelno=" + modelno + ", \ncname=" + cname + machine ;
	}
	
	
}
public class CarDetails {

	public static void main(String[] args) 
	{
		Car c1=new Car();
		c1.setModelno(2023);
		c1.setCname("Fortuner");
		c1.setMachine(new Machine());
		c1.getMachine().setMachinetype("Toyota");
		c1.getMachine().setEngine(new Engine());
		c1.getMachine().getEngine().setEnginetype("petrol");
		c1.getMachine().getEngine().setPrice(5500000);
		
		System.out.println(c1);
		
		

	}

}
