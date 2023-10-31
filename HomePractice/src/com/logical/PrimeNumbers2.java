

package com.logical;

import java.util.Scanner;

public class PrimeNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println("Enter how many prime numbers to sum:");
        int numberOfPrimesToSum = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 2; i <= num; i++) {
            int primeFlag = 1; 

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    primeFlag = 0; 
                    break;
                }
            }

            if (primeFlag == 1) {
            	System.out.println(i);
                sum += i;
                count++;

                if (count == numberOfPrimesToSum) {
                    break; 
                }
            }
        }

        System.out.println("Sum of the first " + numberOfPrimesToSum + " prime numbers: " + sum);
    }
}

