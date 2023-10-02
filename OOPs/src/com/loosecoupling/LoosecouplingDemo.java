package com.loosecoupling;

interface MessageSer {
	void sendMessage(String msg);

}

class Whatsapp1 implements MessageSer {
	String type;

	public void sendMessage(String msg) {
		this.type = "Whatsapp";
		System.out.println(type + "" + msg);

	}
}

class Telegram implements MessageSer {
	String type;

	public void sendMessage(String msg) {
		this.type = "Telegram";
		System.out.println(type + "" + msg);

	}
}

public class LoosecouplingDemo {
	
	public void sendMessage(MessageSer m)
	{
		m.sendMessage("Hello");
	}

	public static void main(String[] args) 
	{
		LoosecouplingDemo d=new LoosecouplingDemo();
		Whatsapp1 w=new Whatsapp1();
		
		d.sendMessage(w);
		
		Telegram t1=new Telegram();
		d.sendMessage(t1);
		
		

	}

}
/*
public class TightcouplingDemo {
	
	public void sendMessage(Whatsapp w)
	{
		m.sendMessage("Welcome");
	}

	public static void main(String[] args) 
	{
		TightcouplingDemo d=new TightcouplingDemo();
		Whatsapp1 w=new Whatsapp1();
		
		d.messagetype(w);
		
		Telegram t1=new Telegram();
		d.messagetype(t1);
		
		

	}

}
*/
