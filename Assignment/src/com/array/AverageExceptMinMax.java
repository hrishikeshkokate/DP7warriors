package com.array;

	public class AverageExceptMinMax {
		 public static double calculateAverageExceptMinMax(int[] arr) {
		        if (arr.length < 3) {
		            // Handle the case when the array has less than 3 elements
		            return 0.0;
		        }

		        int min = arr[0];
		        int max = arr[0];
		        int sum = arr[0];

		        // Find the minimum and maximum values and calculate the sum
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] < min) {
		                min = arr[i];
		            }
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		            sum += arr[i];
		        }

		        // Subtract min and max from the sum and divide by count - 2
		        int count = arr.length - 2;
		        return (double) (sum - min - max) / count;
		    }
	    public static void main(String[] args) {
	        int[] arr = {12, 5, 8, 17, 9, 6};

	        double average = calculateAverageExceptMinMax(arr);

	        System.out.println("Average of elements except min and max: " + average);
	    }

	   
	}


