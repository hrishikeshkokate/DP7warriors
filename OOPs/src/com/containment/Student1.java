package com.containment;

import java.util.Scanner;

public class Student1 {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;

	Student1(int studentId, String studentName, String studentAddress, String collegeName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;

	}

	Student1(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "TQ";

	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String toString() {
		return "studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", collegeName=" + collegeName + "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you from TQ or Not");
		int num = sc.nextInt();

		if (num == 1) {
			Student1 s1 = new Student1(101, "Hrishikesh", "Wakad");
			System.out.println(s1.getStudentId());
			System.out.println(s1.getStudentName());
			System.out.println(s1.getStudentAddress());
			System.out.println(s1.getCollegeName());
		} else if (num == 0) {
			System.out.println("Enter college name");
			String cname = sc.next();
			Student1 s1 = new Student1(102, "Aniket", "FC road", cname);
			System.out.println(s1.getStudentId());
			System.out.println(s1.getStudentName());
			System.out.println(s1.getStudentAddress());
			System.out.println(cname);
		} else {
			System.out.println("Wrong input");
		}

	}

}
