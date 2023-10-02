package com.abstractclass;

abstract class Student {
	private int id;
	private String name;
	private double fees;
	public static String instituteName;

	public Student(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public abstract double giveDiscount();

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getFees() {
		return fees;
	}

	public String getDescription() {
		return "Student ID: " + id + "\n" + "Student Name: " + name + "\n" + "Fees: " + fees + "\n"
				+ "Institute Name: " + instituteName;
	}
}

class DanceStudent extends Student {
	private String danceStyle;

	public DanceStudent(int id, String name, double fees, String danceStyle) {
		super(id, name, fees);
		this.danceStyle = danceStyle;
	}

	@Override
	public double giveDiscount() {

		return 0.1 * getFees();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "\n" + "Dance Style: " + danceStyle;
	}
}

class MusicStudent extends Student {
	private String instrument;

	public MusicStudent(int id, String name, double fees, String instrument) {
		super(id, name, fees);
		this.instrument = instrument;
	}

	@Override
	public double giveDiscount() {

		return 0.05 * getFees();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "\n" + "Instrument: " + instrument;
	}
}

class ArtStudent extends Student {
	private String artForm;

	public ArtStudent(int id, String name, double fees, String artForm) {
		super(id, name, fees);
		this.artForm = artForm;
	}

	@Override
	public double giveDiscount() {

		return 0.15 * getFees();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "\n" + "Art Form: " + artForm;
	}
}

public class Main {
	public static void main(String[] args) {
		Student.instituteName = "ABC Institute";

		Student s;

		s = new DanceStudent(101, "Hrishi", 1000, "Contemporary");
		System.out.println(s.getDescription());
		System.out.println(s.giveDiscount());
		System.out.println("____________________________________");

		s = new MusicStudent(102, "Suraj", 800, "Piano");
		System.out.println(s.getDescription());
		System.out.println(s.giveDiscount());
		System.out.println("____________________________________");

		s = new ArtStudent(103, "Aniket", 1200, "Painting");
		System.out.println(s.getDescription());
		System.out.println(s.giveDiscount());

	}
}
