package com.staticc;

class Patient {
	int id;
	String name;
	String docName;
	static int count = 0;

	{
		count++;
	}

	Patient() {
		docName = "Dr Oberoy";
	}

	Patient(int id, String name,String docName) {
		this();
		this.id = id;
		this.name = name;
		this.docName=docName;

	}

	public String toString() {
		return "id=" + id + ", name=" + name + ", docName=" + docName + "";
	}

}

public class Doctor {

	public static void main(String[] args) {
		Patient p1 = new Patient();
		p1.id=999;
		p1.name="Hrishikesh";
		System.out.println(p1);

		Patient p2 = new Patient();
		p2.id=888;
		p2.name="Aniket";
		p2.docName="Dr Lokare";
		System.out.println(p2);

		System.out.println("Patient visited :" + Patient.count);

	}

}
