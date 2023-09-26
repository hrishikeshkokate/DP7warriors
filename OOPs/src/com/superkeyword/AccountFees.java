package com.superkeyword;

class Student {
	private int id;
	private String name;
	private double fees;

	public Student() {

	}

	public Student(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getFees() {
		return fees;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public void payFees(int months) {
		double monthlyFee = fees / 12;
		double totalFee = monthlyFee * months;
		System.out.println(name + " (ID: " + id + ") paid " + totalFee + " for " + months + " months");
	}
}

class CollegeStudent extends Student {
	private int semNo;
	private String collegeName;

	CollegeStudent() {

	}

	public CollegeStudent(int id, String name, double fees, int semNo, String collegeName) {
		super(id, name, fees);
		this.semNo = semNo;
		this.collegeName = collegeName;
	}

	public int getSemNo() {
		return semNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setSemNo(int semNo) {
		this.semNo = semNo;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public void payFees(int months) {
		double halfYearlyFee = getFees() / 2;
		double totalFee = halfYearlyFee * (months / 6);
		System.out.println(
				getName() + " (ID: " + getId() + ") paid " + totalFee + " for " + months + " months (Half-yearly)");
	}
}

class SchoolStudent extends Student {
	private int inStd;
	private String schoolName;

	SchoolStudent() 
	{

	}

	public SchoolStudent(int id, String name, double fees, int inStd, String schoolName) {
		super(id, name, fees);
		this.inStd = inStd;
		this.schoolName = schoolName;
	}

	public int getInStd() {
		return inStd;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setInStd(int inStd) {
		this.inStd = inStd;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public void payFees(int months) {
		double quarterlyFee = getFees() / 4;
		double totalFee = quarterlyFee * (months / 3);
		System.out.println(
				getName() + " (ID: " + getId() + ") paid " + totalFee + " for " + months + " months (Quarterly)");
	}
}

public class AccountFees {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Suraj", 12000);
		CollegeStudent student2 = new CollegeStudent(2, "Hrishikesh", 25000, 2, "XYZ College");
		SchoolStudent student3 = new SchoolStudent(3, "Aniket", 18000, 6, "ABC School");

		student1.payFees(1); // Monthly payment
		student2.payFees(6); // Half-yearly payment
		student3.payFees(3); // Quarterly payment
	}
}
