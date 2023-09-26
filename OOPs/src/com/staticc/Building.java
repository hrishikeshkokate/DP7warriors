package com.staticc;

class Society {
	int flatno;
	int floorno;
	int noOfmember;
	char wing;
	static String societyname;

	static {
		societyname = "Pride";
	}

	Society() {
		societyname = "Pride PVT LTD";
	}

	Society(int flatno, int floorno, int noOfmember, char wing) {
		this.flatno = flatno;
		this.floorno = floorno;
		this.noOfmember = noOfmember;
		this.wing = wing;
	}

	static void playarea() {
		System.out.println("play area belongs to:" + societyname);
	}

	static void gym() {
		System.out.println("gym belongs to:" + societyname);
	}

	public String toString() {
		return "flatno=" + flatno + ", floorno=" + floorno + ", noOfmember=" + noOfmember + ", wing=" + wing
				+ " societyname=" + societyname;
	}
}

public class Building {

	public static void main(String[] args) {
		Society.playarea();
		Society.gym();
		Society b1 = new Society(902, 9, 5, 'A');
		System.out.println(b1);
		System.out.println();

		Society b2 = new Society();
		b2.flatno = 804;
		b2.floorno = 5;
		b2.noOfmember = 5;
		b2.wing = 'B';

		System.out.println(b2);

	}

}
