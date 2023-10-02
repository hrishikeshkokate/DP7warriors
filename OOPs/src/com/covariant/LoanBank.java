package com.covariant;

class Loan {
	private double amount;
	private double interestRate;

	public Loan(double amount, double interestRate) {
		this.amount = amount;
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public double getInterestRate() {
		return interestRate;
	}
}

class HomeLoan extends Loan {
	public HomeLoan(double amount, double interestRate) {
		super(amount, interestRate);
	}
}

class CarLoan extends Loan {
	public CarLoan(double amount, double interestRate) {
		super(amount, interestRate);
	}
}

class EducationLoan extends Loan {
	public EducationLoan(double amount, double interestRate) {
		super(amount, interestRate);
	}
}

class Bank {
	public Loan provideLoan(double amount, double interestRate) {
		return new Loan(amount, interestRate);
	}
}

class HDFC extends Bank {
	@Override
	public Loan provideLoan(double amount, double interestRate) {
		if (amount <= 1000000 && interestRate <= 10.0) {
			return new CarLoan(amount, interestRate);
		} else {
			// Return a regular loan if conditions are not met
			return super.provideLoan(amount, interestRate);
		}
	}
}

class ICICI extends Bank {
	@Override
	public Loan provideLoan(double amount, double interestRate) {
		if (amount <= 2000000 && interestRate <= 9.0) {
			return new HomeLoan(amount, interestRate);
		} else {
			// Return a regular loan if conditions are not met
			return super.provideLoan(amount, interestRate);
		}
	}
}

public class LoanBank {
	public static void main(String[] args) {
		Bank bank = new Bank();
		HDFC hdfc = new HDFC();
		ICICI icici = new ICICI();

		Loan regularLoan = bank.provideLoan(500000, 8.5);
		Loan carLoan = hdfc.provideLoan(800000, 9.5);
		Loan homeLoan = icici.provideLoan(1500000, 7.5);

		System.out.println("Regular Loan Amount: " + regularLoan.getAmount() + ", Interest Rate: "
				+ regularLoan.getInterestRate());
		System.out.println("Car Loan Amount: " + carLoan.getAmount() + ", Interest Rate: " + carLoan.getInterestRate());
		System.out.println(
				"Home Loan Amount: " + homeLoan.getAmount() + ", Interest Rate: " + homeLoan.getInterestRate());
	}
}
