package co.lab;

import java.util.Scanner;

/*In a premier championship series of sports car racing, initially, the 1st car is ahead of the 2nd car by X metres. After that, in every second, the 1st car moves ahead by n1 metres and the 2nd car moves ahead by n2 metres (in the same direction). The task is to print the number of seconds after which the 2nd car crosses the 1st car. If it is impossible to do so, then print -1.

Example 1:
Input:
3 --- Value of n1
4 --- Value of n2
1 --- Value of X

Output:
2

Explanation:
Initially, the 1st car is ahead by 1 metre.
After the 1st second, the 1st and 2nd cars are at the same place.
After the 2nd second, the 2nd car moves ahead of the 1st car by 1 metre.

Example 2:
Input:
5 --- Value of n1
4 --- Value of n2
1 --- Value of X

Output:
-1

Example 3:
Input:
2 --- Value of n1
12 --- Value of n2
15 --- Value of X

Output:
2

Constraints:
• 1 < = n1
• 1 < = n2
• 0 < = K < 1000

Input format for testing:
• The candidate has to write the code to accept three positive integer numbers separated by a new line.
• First input line: Accept value for n1.
• Second input line: Accept value for n2.
• Third input line: Accept value for X.

Output format for testing:
• The output should be positive integers only. (See the output format in Example 1 and Example 2).
• Additional messages in the output will result in the failure of test cases.

Instructions:
• The system does not allow any kind of hard-coded input value/values.
• The written program code by the candidate will be verified against the inputs which are supplied from the system.*/

public class CarRace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n1");
		int n1 = scanner.nextInt();
		System.out.println("Enter n2");
		int n2 = scanner.nextInt();
		System.out.println("Enter x");
		int X = scanner.nextInt();

		int seconds = calculateSeconds(n1, n2, X);
		System.out.println(seconds);
	}

	public static int calculateSeconds(int n1, int n2, int X) {
		if (n1 <= n2) // If the first car is not faster than the second car, it's impossible for the
						// second car to catch up.
			return -1;

		int distanceDifference = n1 - n2;
		if (X % distanceDifference == 0) // If the distance difference evenly divides X, then the second car will never
											// catch up.
			return -1;

		int seconds = X / distanceDifference;
		if (seconds % 2 == 0) // If the seconds is even, the second car will catch up in the next second, so
								// add 1 to seconds.
			seconds++;
		else // If the seconds is odd, the second car is already ahead, no need to add 1.
			seconds += 2;

		return seconds;
	}
}
