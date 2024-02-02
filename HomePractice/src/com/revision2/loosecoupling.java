package com.revision2;

interface Employee {

	void work();
}

class Developer implements Employee {

	@Override
	public void work() {
		System.out.println("Developer is coding..");
	}
}

class Manager implements Employee {

	@Override
	public void work() {
		System.out.println("Manager is managing task..");
	}
}

class Company {
	private Employee employee;

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void performWork() {
		employee.work();
	}
}

public class loosecoupling {

	public static void main(String argvs[]) {

		Company c = new Company();
		c.setEmployee(new Developer());
		c.performWork();

		c.setEmployee(new Manager());
		c.performWork();
	}
}