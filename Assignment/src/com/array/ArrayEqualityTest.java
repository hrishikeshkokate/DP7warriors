package com.array;

public class ArrayEqualityTest {
	 public static boolean areArraysEqual(int[] arr1, int[] arr2) {
	        // Check if the arrays have the same length
	        if (arr1.length != arr2.length) {
	            return false;
	        }

	        // Compare each element of the arrays
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
	                return false;
	            }
	        }

	        return true;
	    }
    public static void main(String[] args) {
        int[] arr1 = {12, 22, 32, 42, 52, 62};
        int[] arr2 = {52, 22, 62, 12, 42, 32};

        boolean areEqual = areArraysEqual(arr1, arr2);

        if (areEqual) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Both arrays are not equal.");
        }
    }

   
}
