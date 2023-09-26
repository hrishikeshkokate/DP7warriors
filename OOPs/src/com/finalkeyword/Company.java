package com.finalkeyword;

class Developer {
	String ename;
	final float salary;
	final static int noofhour;
	final String cname;

	static {
		noofhour = 8;
	}

	{
		// noofhours=10;
		cname = "HCL";
	}

	public Developer() {
		salary = 10000f;
	}

	public Developer(String ename, float salary) {
		this.ename = ename;
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public static int getNoofhour() {
		return noofhour;
	}

	public String getCname() {
		return cname;
	}

	void skills() {
		System.out.println("java");
	}

}

class Fullstackdeveloper extends Developer {
	void skills() {
		System.out.println("Angular");
	}

}

public class Company {

	public static void main(String[] args) {
		Developer d = new Developer();
		System.out.println(d.cname + "" + d.ename + "" + d.salary);

		d.setEname("Hrishikesh");

		System.out.println(d.cname + "" + d.ename + "" + d.salary);

		Developer d1 = new Developer("Aniket", 25000f);

		System.out.println(d.cname + "" + d.ename + "" + d.salary);

		// no setters for final variable
		// must be initializw while creating object

	}

}
