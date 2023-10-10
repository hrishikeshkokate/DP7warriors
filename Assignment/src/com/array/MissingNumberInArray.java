package com.array;


	public class MissingNumberInArray {
		public static int findMissingNumber(int[] arr, int n) {
	        // Calculate the sum of the first n natural numbers
	        int expectedSum = (n * (n + 1)) / 2;
	        
	        // Calculate the sum of elements in the array
	        int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num;
	        }
	        
	        // The missing number is the difference between the expected sum and actual sum
	        return expectedSum - actualSum;
	    }
	    public static void main(String[] args) {
	        // Define the array with missing number
	        int[] arr = {1, 2, 3, 4, 6, 7};
	        
	        // Define the range (n) for the sequence
	        int n = 7; // For example, if the sequence is 1 to 7

	        int missingNumber = findMissingNumber(arr, n);
	        
	        System.out.println("The missing number is: " + missingNumber);
	    }

	    
	}


