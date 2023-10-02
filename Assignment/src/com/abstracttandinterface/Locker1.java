package com.abstracttandinterface;

interface Locker {
	void depositMoney(double amount);

	void depositJewelry(String item);

	boolean withdrawMoney(double amount, String pinCode);

	boolean isLocked();
}

class PrivateLocker implements Locker {
	private double money;
	private String jewelry;
	private String pinCode;
	private boolean locked;

	PrivateLocker(String pinCode) {
		this.money = 0.0;
		this.jewelry = "";
		this.pinCode = pinCode;
		this.locked = true;
	}

	@Override
	public void depositMoney(double amount) {
		if (!locked) {
			this.money += amount;
			System.out.println("Deposited money: $" + amount);
		} else {
			System.out.println("Locker is locked. Cannot deposit money.");
		}
	}

	@Override
	public void depositJewelry(String item) {
		if (!locked) {
			this.jewelry = item;
			System.out.println("Deposited jewelry: " + item);
		} else {
			System.out.println("Locker is locked. Cannot deposit jewelry.");
		}
	}

	@Override
	public boolean withdrawMoney(double amount, String pinCode) {
		if (!locked && this.pinCode.equals(pinCode) && amount <= this.money) {
			this.money -= amount;
			System.out.println("Withdrawn money: $" + amount);
			return true;
		} else {
			System.out.println("Cannot withdraw money. Locker is locked or pin code is incorrect.");
			return false;
		}
	}

	@Override
	public boolean isLocked() {
		return locked;
	}

	public void unlock(String enteredPin) {
		if (pinCode.equals(enteredPin)) {
			locked = false;
			System.out.println("Locker is unlocked.");
		} else {
			System.out.println("Incorrect pin code. Locker remains locked.");
		}
	}

	public void displayContents() {
		if (!locked) {
			System.out.println("Money: $" + money);
			System.out.println("Jewelry: " + jewelry);
		} else {
			System.out.println("Locker is locked. Contents not accessible.");
		}
	}
}

public class Locker1 {
	public static void main(String[] args) {
		PrivateLocker locker = new PrivateLocker("1234");

		locker.depositMoney(1000.0);
		locker.depositJewelry("Diamond Ring");

		locker.unlock("1234");

		locker.displayContents();
		locker.withdrawMoney(500.0, "1234");
	}
}
