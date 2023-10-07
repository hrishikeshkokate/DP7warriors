package com.objectArray;

import java.util.Arrays;
import java.util.Scanner;

class Employee
{
	private String name;
	private int id;
	private int salary[];
	public Employee() {
		salary=new int[3];
	}
	public Employee(String name, int id, int[] salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int[] getSalary() {
		return salary;
	}
	public void setSalary(int[] salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + Arrays.toString(salary) + "]";
	}
	
}
public class Employeesalary {
	static Scanner sc = new Scanner(System.in);

	static void enterdetails(Employee e) {
		System.out.println("Enter employee id :");
		e.setId(sc.nextInt());

		System.out.println("Enter salary name :");
		e.setName(sc.next());

		int m[] = new int[5];
		System.out.println("Enter the salary of 5 month");

		for (int i = 0; i < m.length; i++) {
			System.out.println("Salary :" + (i + 1) + ":");
			m[i] = sc.nextInt();
		}
		e.setSalary(m);

	}
	
	static int total(Employee e) {
		int m[] = e.getSalary();
		int total = 0;
		for (float m1 : m) {
			total += m1;
		}
		return total;
	}
	static void highest(Employee emp[])
	{
		int maxsalary = Integer.MIN_VALUE;
		Employee st = new Employee();

		for (Employee e : emp) 
		{
//			if (e.getSalary() > maxsalary) 
//			{
//				maxsalary = e.getSalary();
//				st = e;
//			}
		}
		System.out.println(st);
	}
	
	static void sortsalary(Employee emp[]) 
	{
		Employee em = new Employee();
		for (int i = 0; i < emp.length; i++) 
		{
			for (int j = i + 1; j < emp.length; j++)
             {
//				if (emp[i].getSalary() < emp[j].getSalary()) 
//				{
//					em = emp[i];
//					emp[i] = emp[j];
//					emp[j] = em;
//				}
			}
		}
	}

	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			enterdetails(emp[i]);

		}
		System.out.println("_______________________________________");
		for (Employee e : emp) 
		{
			System.out.println(e.getId() + " " + e.getName() + " " + total(e));
		}
		
		System.out.println("_______________________________________");
		System.out.println("Highest salary");
		highest(emp);
		
		System.out.println("_______________________________________");
		System.out.println("Sorting marks");
		sortsalary(emp);
		for (int i = 0; i < emp.length; i++) 
		{
			System.out.println(emp[i]);
		}

	}

}
