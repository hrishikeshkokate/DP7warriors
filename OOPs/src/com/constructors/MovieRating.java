package com.constructors;
public class MovieRating {
	static void rating(Movie m) {
		if (m.getrating() > 7) {
			System.out.println(m);
		}
	}
	public static void main(String[] args) {
		Movie m1 = new Movie(123, "RRR", 9.5f);
		Movie m2 = new Movie(456, "OMG", 8.2f);
		Movie m3 = new Movie(789, "Bahubali", 7.1f);
		Movie m4 = new Movie(101, "Avtar", 6.3f);
		Movie m5 = new Movie(112, "Gadar", 5.7f);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println();

		System.out.println("______Movies above 7 star ______");
		rating(m1);
		rating(m2);
		rating(m3);
		rating(m4);
		rating(m5);
	}
}
