/*	Create two object of Car class and change value of 
  static variable by 1st object and print it by accessing
   2nd object.*/

package com.staticandfinal;


	public class Car {
	    private String model;
	    private static int totalCarSold = 0;

	    public Car(String model) {
	        this.model = model;
	        totalCarSold++;
	    }

	    public String getModel() {
	        return model;
	    }

	    public static int getTotalCarSold() {
	        return totalCarSold;
	    }

	    public static void main(String[] args) {
	        Car car1 = new Car("Toyota");
	        Car car2 = new Car("Honda");

	        // Access and change the static variable using the first object (car1)
	        car1.totalCarSold = 42;

	        // Access and print the static variable using the second object (car2)
	        System.out.println("Total Cars Sold (via car2): " + car2.getTotalCarSold());
	    }
	}


