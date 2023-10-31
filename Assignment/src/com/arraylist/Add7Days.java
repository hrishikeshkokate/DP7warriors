package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Add7Days {

	public static void main(String[] args) {

		ArrayList<String> days = new ArrayList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");

		Iterator<String> itr = days.iterator();
		while (itr.hasNext()) {
			if (itr.next().length() > 7) {
				itr.remove();
			}
		}
		for (String s : days) {
			System.out.println(s);
		}

	}

}
