package com.interfacee;

interface Keyboard {
	String display();
}

class Dell implements Keyboard {

	@Override
	public String display() {
		return "Its DELL keyboard.";
	}
}

class Hp implements Keyboard {

	@Override
	public String display() {
		return "Its HP keyboard.";
	}
}

class Key {

	void display(Keyboard k) {
		System.out.println(k.display());

	}
}

public class Keymain {

	public static void main(String[] args) 
	{
		Key k=new Key();
		
		Dell d=new Dell();
		k.display(d);
		
		Hp h=new Hp();
		k.display(h);
		

	}
}
