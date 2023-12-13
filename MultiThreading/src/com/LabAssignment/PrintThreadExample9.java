package com.LabAssignment;

class CharacterPrinter implements Runnable {
	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'h'; ch++) {
			System.out.print(ch + " ");
		}
	}
}

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

public class PrintThreadExample9 {
	public static void main(String[] args) {

		Thread t1 = new Thread(new CharacterPrinter());
		Thread t2 = new Thread(new NumberPrinter());

		t1.start();

		try {

			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();

		try {

			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
