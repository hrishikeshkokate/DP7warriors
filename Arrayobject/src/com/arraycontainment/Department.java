package com.arraycontainment;

public class Department {
	private int id;
	private String department;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String department) {
		super();
		this.id = id;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", department=" + department + "]";
	}
	
}
