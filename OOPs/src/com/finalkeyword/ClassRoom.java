package com.finalkeyword;

class Person {
	String sname;
	final String adharnum;
	final static String pancardnum;

	static {
		pancardnum = "456312581546";
	}

	Person() {
		adharnum = "abcd-efgh-ijkl";
	}

	Person(String sname, String adharnum) {
		this.sname = sname;
		this.adharnum = adharnum;

	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAdharnum() {
		return adharnum;
	}

	// public void setAdharnum(String adharnum) {
	// this.adharnum=adharnum;
	// }
//we cannot set ,as it is final
	public static String getPancardnum() {
		return pancardnum;
	}

	public String toString() {
		return "Student [sname=" + sname + ", adharnum=" + adharnum + "]";
	}

}

class Student extends Person {
	String schname;

	Student() {

	}

	Student(String schname) {
		this.schname = schname;

	}

	public String getSchname() {
		return schname;
	}

	public void setSchname(String schname) {
		this.schname = schname;
	}

	public String toString() {
		return "School [schname=" + schname + "]";
	}

}

public class ClassRoom {

	public static void main(String[] args) {

		Student s = new Student();
		System.out.println("student name :" + s.sname + "\nadhar number :" + s.adharnum + "\npancard number :"
				+ s.getPancardnum() + "\nschool name :" + s.schname);
		System.out.println("__________________________");

		s.setSname("Hrishikesh");
		s.setSchname("St Marry");

		System.out.println("student name :" + s.sname + "\nadhar number :" + s.adharnum + "\npancard number :"
				+ s.getPancardnum() + "\nschool name :" + s.schname);

		// no setters for final variable
		// must be initializw while creating object

	}

}
