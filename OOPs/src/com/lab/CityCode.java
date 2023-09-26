package com.lab;

import java.util.Scanner;

public class CityCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter city name: ");
		String city = sc.next();

		String cityCode;

		switch (city) {
		case "mumbai":
			cityCode = "MH-01";
			break;
		case "pune":
			cityCode = "MH-12";
			break;
		case "nagpur":
			cityCode = "MH-31";
			break;
		default:
			cityCode = "MH-00";
			break;
		}

		System.out.println("City code for " + city + " is " + cityCode);
	}
}
