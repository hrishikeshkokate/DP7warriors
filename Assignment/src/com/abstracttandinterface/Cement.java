package com.abstracttandinterface;

interface Equipment {
	void fill();

	void mix();
}

class Cement_mixer implements Equipment {
	@Override
	public void fill() {
		System.out.println("Cement mixer is filled with materials.");
	}

	@Override
	public void mix() {
		System.out.println("Cement mixer is mixing the materials.");
	}

	public void pour() {
		System.out.println("Cement mixer is pouring the mixture.");
	}
}

public class Cement {
	public static void main(String[] args) {

		Cement_mixer cementMixer = new Cement_mixer();

		cementMixer.fill();
		cementMixer.mix();
		cementMixer.pour();

		Equipment e;
		e = new Cement_mixer();

		e.fill();
		e.mix();
		// e.pour(); // This line would result in a compilation error because the
		// reference type Equipment does not have the pour() method.
	}
}
