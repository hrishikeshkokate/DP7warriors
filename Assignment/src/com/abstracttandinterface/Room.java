package com.abstracttandinterface;

interface Closet {
	void openCloset();

	void closeCloset();
}

class RoomCloset implements Closet {
	private boolean isOpen = false;

	RoomCloset() {

		isOpen = false;
	}

	@Override
	public void openCloset() {
		if (!isOpen) {
			System.out.println("Closet is now open.");
			isOpen = true;
		} else {
			System.out.println("Closet is already open.");
		}
	}

	@Override
	public void closeCloset() {
		if (isOpen) {
			System.out.println("Closet is now closed.");
			isOpen = false;
		} else {
			System.out.println("Closet is already closed.");
		}
	}
}

public class Room {
	public static void main(String[] args) {

		Closet closet = new RoomCloset();

		closet.openCloset();

		closet.closeCloset();
	}
}
