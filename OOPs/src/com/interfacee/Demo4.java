package com.interfacee;

interface Messageservice {
	void sendmessage(String message);

}

class WhatsAppMessage implements Messageservice {
	@Override
	public void sendmessage(String message) {

		System.out.println("Sending WhatsApp message: " + message);
	}
}

class NormalMessage implements Messageservice {
	@Override
	public void sendmessage(String message) {

		System.out.println("Sending normal text message: " + message);
	}
}

class InstagramMessage implements Messageservice {
	@Override
	public void sendmessage(String message) {

		System.out.println("Sending Instagram message: " + message);
	}
}

public class Demo4 {

	public static void main(String[] args) {
		
		Messageservice m;
		m=new WhatsAppMessage();
		m.sendmessage("good evening");
		
		m=new NormalMessage();
		m.sendmessage("hello");
		
		m=new InstagramMessage();
		m.sendmessage("new follower");

	}

}
