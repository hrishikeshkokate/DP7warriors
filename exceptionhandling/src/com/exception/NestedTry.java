package com.exception;

public class NestedTry {

	public static void main(String[] args) {

		int arr[] = { 4, 0, 9 };

		try {

			for (int i = 0; i <= arr.length; i++) {
				try {
					System.out.println("ans :" + (100 / arr[i]));
				} catch (ArithmeticException e) {
					System.out.println(e + " - Cannot divide by zero");
				}

			}

		}
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}

		// The below codes becomes unreachable code if you create Exception

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e + " - Index is greater");
		}

		catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("---------------------------------");
			System.out.println("Task closed");
		}

	}

}
