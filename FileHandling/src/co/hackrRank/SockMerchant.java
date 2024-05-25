package co.hackrRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example


There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock
Returns

int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers, , the colors of the socks in the pile.

Constraints

 where 
Sample Input

STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
Sample Output

3*/

public class SockMerchant {

	public static int sockMerchant(int n, List<Integer> ar) {
		// Create a HashMap to count occurrences of each color
		Map<Integer, Integer> colorCounts = new HashMap<>();
		for (int color : ar) {
			colorCounts.put(color, colorCounts.getOrDefault(color, 0) + 1);
		}

		// Count the number of pairs for each color
		int pairCount = 0;
		for (int count : colorCounts.values()) {
			pairCount += count / 2;
		}

		return pairCount;
	}

	public static void main(String[] args) {
		// Sample Input
		int n = 9;
		List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

		// Output the result
		System.out.println(sockMerchant(n, ar)); // Output: 3
	}
}
