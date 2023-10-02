package com.interfacee;

interface TaxPay1 {
	 String cname = "India";
	 

	void taxamount();

}

interface Total {
	void totalmount();

}

class Celebrity1 implements TaxPay1, Total {
	String celebname="Akshay";
	float income;

	public Celebrity1() {

	}

	public Celebrity1(String celebname, float income) {
		this.celebname = celebname;
		this.income = income;

	}

	public void taxamount() {
		System.out.println("celebrity amount of tax :" + (0.2 * income));
	}

	@Override
	public void totalmount() {
		System.out.println("Tax paid + income :" + ((0.2 * income) + income));

	}

}

class Employee1 implements TaxPay1, Total {
	String ename;
	float esalary;

	Employee1() {

	}

	Employee1(String ename, float esalary) {
		this.ename = ename;
		this.esalary = esalary;

	}

	@Override
	public void taxamount() {
		if (esalary > 50000) {
			System.out.println("Employee amount of tax :" + (0.1 * esalary));
		} else {
			System.out.println("Employee salary is tax free");
		}

	}

	@Override
	public void totalmount() {
		System.out.println("Tax paid + salary :" + ((0.1 * esalary) + esalary));

	}
}

class Car1 implements TaxPay1, Total {
	String cartype;
	float carprice;

	Car1() {

	}

	Car1(String cartype, float carprice) {
		this.cartype = cartype;
		this.carprice = carprice;

	}

	public void taxamount() {
		if (cartype == "Suv") {
			System.out.println("tax for suv car is :" + (0.2 * carprice));
		} else {
			System.out.println("It is a sedan car and tax is :" + (0.1 * carprice));
		}

	}

	@Override
	public void totalmount() {
		System.out.println("Tax paid + Car price :" + ((0.2 * carprice) + carprice));

	}

}

public class LabInterface {

	public static void main(String[] args) {
		TaxPay1 t;
		t = new Celebrity1("Akshay kumar", 5500000);
		t.taxamount();
		
		System.out.println("____________________________");

		t = new Employee1("Hrishikesh", 700000);
		t.taxamount();

		System.out.println("____________________________");

		t = new Car1("Suv", 950000);
		t.taxamount();

	}

}
