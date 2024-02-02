package com.exception;

import java.util.Scanner;

public class MutiCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			int arr[] = new int[3];

			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter a number:");
				arr[i] = sc.nextInt();
			}
			System.out.println("---------------------------------");

			for (int i = 0; i < arr.length; i++) {
				System.out.println("ans :" + (100 / arr[i]));
			}

		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}

		// The below codes becomes unreachable code if you create Exception

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " - Index is greater");
		} catch (ArithmeticException e) {
			System.out.println(e + " - Cannot divide by zero");
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		finally {
			System.out.println("---------------------------------");
			sc.close();
			System.out.println("Scanner closed");
		}

	}


