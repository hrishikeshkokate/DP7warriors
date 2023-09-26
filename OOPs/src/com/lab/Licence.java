package com.lab;

class DrivingLicense {
	private String licenseNumber;
	private String holderName;

	public DrivingLicense(String licenseNumber, String holderName) {
		this.licenseNumber = licenseNumber;
		this.holderName = holderName;
	}

	public void displayLicenseInfo() {
		System.out.println("License Number: " + licenseNumber);
		System.out.println("Holder Name: " + holderName);
	}
}

class ProvisionalLicense extends DrivingLicense {
	private int permitAge;

	public ProvisionalLicense(String licenseNumber, String holderName, int permitAge) {
		super(licenseNumber, holderName);
		this.permitAge = permitAge;
	}

	public void displayLicenseInfo() {
		super.displayLicenseInfo();
		System.out.println("License Type: Provisional");
		System.out.println("Permit Age: " + permitAge + " years");
	}
}

class FullLicense extends DrivingLicense {
	private String vehicleType;

	public FullLicense(String licenseNumber, String holderName, String vehicleType) {
		super(licenseNumber, holderName);
		this.vehicleType = vehicleType;
	}

	public void displayLicenseInfo() {
		super.displayLicenseInfo();
		System.out.println("License Type: Full");
		System.out.println("Authorized Vehicle Type: " + vehicleType);
	}
}

public class Licence {
	public static void main(String[] args) {
		DrivingLicense provisionalLicense = new ProvisionalLicense("P12345", "Hrishikesh", 18);
		DrivingLicense fullLicense = new FullLicense("F67890", "Aniket", "Car");

		System.out.println("Provisional License Info:");
		provisionalLicense.displayLicenseInfo();

		System.out.println("\nFull License Info:");
		fullLicense.displayLicenseInfo();
	}
}

/*Method overriding is a concept in object-oriented programming
where a subclass provides a specific implementation of a method 
that is already defined in its superclass. This allows the subclass
to customize the behavior of the inherited method. Method overriding
is important for achieving polymorphism, which allows you to work 
with objects of different classes through a common interface.*/


