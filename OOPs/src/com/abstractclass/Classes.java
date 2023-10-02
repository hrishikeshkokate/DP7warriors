/*package com.abstractclass;

abstract class Student {
	int id;
	String name;
	float fees;

	static String instituteName;

	static {
		instituteName = "Think Quotient";
	}

	Student() {

	}

	public Student(int id, String name, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public static void setBrandName(String instituteName) {
		Student.instituteName = instituteName;
	}

	abstract void description();

	static float giveDiscount() {
		return 20f;
	}

	final void display() {
		System.out.println("Institute name " + instituteName);
		System.out.println("Discount on all courses :" + (giveDiscount() + "%"));
		System.out.println("Name " + name);
		System.out.println("id " + id);
		System.out.println("Fees " + fees);
	}

}

class Dancestudent extends Student {
	private String dancetype;
	private int time;

	Dancestudent() {

	}

	public Dancestudent(int id, String name, float fees, String dancetype, int time) {
		super(id, name, fees);
		this.dancetype = dancetype;
		this.time = time;

	}

	void description() {
		System.out.println("This is dance class ");
		System.out.println("class timing is " + time);
		System.out.println("Dance type " + dancetype);

	}

}

class Artstudent extends Student {
	private String artname;
	private int artprice;

	Artstudent() {

	}

	public Artstudent(int id, String name, float fees, String artname, int artprice) {
		super(id, name, fees);
		this.artname = artname;
		this.artprice = artprice;

	}

	void description() {
		System.out.println("This is art class ");
		System.out.println("class price is " + artprice);
		System.out.println("art name " + artname);

	}

}

class Musicstudent extends Student {
	private String musicname;
	private float musicLength;

	Musicstudent() {

	}

	public Musicstudent(int id, String name, float fees, String musicname, float musicLength) {
		super(id, name, fees);
		this.musicname = musicname;
		this.musicLength = musicLength;

	}

	void description() {
		System.out.println("This is music class ");
		System.out.println("music length is " + musicLength);
		System.out.println("music name " + musicname);

	}

}

public class Classes {

	public static void main(String[] args) {

		Student s;
		s = new Musicstudent(101, "Hrishikesh", 55000, "Drawing", 6);
		s.display();
		s.description();

	}

}
*/
