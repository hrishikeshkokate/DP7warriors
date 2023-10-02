package com.interfacee;

interface TaxPay {
	String cname = "India";

	void taxamount();

}

class Celebrity implements TaxPay {
	String celebname;
	float income;

	public Celebrity() {

	}

	public Celebrity(String celebname, float income) {
		this.celebname = celebname;
		this.income = income;

	}

	public void taxamount() {
		System.out.println("celebrity amount of tax :" + (0.2 * income));
	}

}

class Employee implements TaxPay {
	String ename;
	float salary;

	public Employee() {

	}

	public Employee(String ename, float salary) {
		this.ename = ename;
		this.salary = salary;

	}

	public void taxamount() {
		if(salary>500000)
		{
			System.out.println("Employee amount of tax :"+(0.1*salary));
		}
		else
		{
			System.out.println("Your salary is tax free");
		}
	}

}

public class Demo2 {

	public static void main(String[] args) {

		Celebrity c = new Celebrity("Nana patekar", 6600000);
		c.taxamount();

		Employee e = new Employee("Hrishikesh", 509999);
		e.taxamount();

	}

}
