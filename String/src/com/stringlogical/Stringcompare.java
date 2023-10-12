package com.stringlogical;

public class Stringcompare {

	static void uniquename(String[] str1, String[] str2) {
		boolean found;
		for (String s : str2) {
			found = false;

			for (String si : str1) {
				if (s.equals(si)) {
					found = true;
					break;
				}
			}
			if (!found)
				System.out.println(s);
		}
	}

	public static void main(String[] args) {

		String str1[] = { "Suraj", "Aniket", "Pralay", "Kailash" };
		String str2[] = { "Suraj", "Hrishikesh", "Aniket", "Anuj", "Pralay", "Kailash" };

		uniquename(str1, str2);

	}
}
