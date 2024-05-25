package co.hackrRank;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*Given a sentence Str. The task is to find whether the given sentence contains all letters of the English alphabet (a to z or A to Z). If it does not, then print all missing letters of the alphabet, otherwise print 0.

Note:
• All characters in the given sentence should be treated as case insensitive, which means that ‘A’ and ‘a’ are to be treated as the same.
• The output should be in alphabetic order.
• The output should contain only lowercase alphabets.
• If none of the letters are missing, print 0 as output.

Example 1:
Input:
The four boxing wizard starts over the quickly --- Value of Str

Output:
jmp --- Missing letters*/
public class MissingLetters {

	public static String findMissingLetters(String str) {
		Set<Character> lettersSet = new HashSet<>();
		str = str.toLowerCase(); // Convert the sentence to lowercase for case insensitivity

		// Iterate through the sentence and add letters to the set
		for (char ch : str.toCharArray()) {
			if (Character.isLetter(ch)) {
				lettersSet.add(ch);
			}
		}

		// Check if any letters are missing
		Set<Character> missingLetters = new TreeSet<>();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!lettersSet.contains(ch)) {
				missingLetters.add(ch);
			}
		}

		// If any letters are missing, return them; otherwise, return "0"
		if (!missingLetters.isEmpty()) {
			StringBuilder result = new StringBuilder();
			for (char ch : missingLetters) {
				result.append(ch);
			}
			return result.toString();
		} else {
			return "0";
		}
	}

	public static void main(String[] args) {
		// Example Input
		String sentence = "The four boxing wizard starts over the quickly";

		// Output the result
		System.out.println(findMissingLetters(sentence)); // Output: jmp
	}
}
