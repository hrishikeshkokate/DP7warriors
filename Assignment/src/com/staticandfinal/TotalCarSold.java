/*Create a class Car with String model and in totalCarSold as 
  static variable in main() method*/

package com.staticandfinal;

	public class TotalCarSold {
	    private String model;
	    private static int totalCarSold = 0;

	    public TotalCarSold(String model) {
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
	    	TotalCarSold car1 = new TotalCarSold("Toyota");
	        TotalCarSold car2 = new TotalCarSold("Honda");

	        System.out.println("Car 1 Model: " + car1.getModel());
	        System.out.println("Car 2 Model: " + car2.getModel());

	        System.out.println("Total Cars Sold: " + TotalCarSold.getTotalCarSold());
	    }
	}


