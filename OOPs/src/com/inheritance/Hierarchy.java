package com.inheritance;

class Student {
	private int sid;
	private String sname;

	public Student() {

	}

	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}

}

class SchoolStudent extends Student {
	private String schname;
	private int schfees;

	public SchoolStudent() {
		super();

	}

	public SchoolStudent(int sid, String sname, String schname, int schfees) {
		super(sid, sname);
		this.schname = schname;
		this.schfees = schfees;
	}

	public String getSchname() {
		return schname;
	}

	public void setSchname(String schname) {
		this.schname = schname;
	}

	public int getSchfees() {
		return schfees;
	}

	public void setSchfees(int schfees) {
		this.schfees = schfees;
	}

	public String toString() {
		return super.toString()+"schname=" + schname + ", schfees=" + schfees;
	}

}

class CollegeStudent extends Student {

	private String university;
	private float fees;
	private int sem;

	CollegeStudent() {
		super();
	}

	public CollegeStudent(int sId, String sName, String university, float fees, int sem) {
		super(sId, sName);
		this.university = university;
		this.fees = fees;
		this.sem = sem;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCollege Details\nUniversity=" + university + ", Fees=" + fees + ", Sem=" + sem;
	}

}

public class Hierarchy {

	public static void main(String[] args) {

		SchoolStudent sc = new SchoolStudent(55,"Hrishi","lords", 999999);

		CollegeStudent collegeStudent = new CollegeStudent(201, "Hrishikesh", "VTU", 80000f, 5);

		System.out.println(sc);
		System.out.println();
		System.out.println(collegeStudent);

	}

}
