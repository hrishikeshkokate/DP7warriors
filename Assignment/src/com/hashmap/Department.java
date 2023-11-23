package com.hashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {

	private int id;
	private String name;
	private List<Student> list;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.list = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public void addStudent(Student student) {
		list.add(student);
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", list=" + list + "]";
	}

}
