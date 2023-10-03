package com.interfacee;
interface Subject
{
	void display();
}
class Topic implements Subject
{
	String topicname;
	String subject;
	
	Topic(String topicname,String subject)
	{
		this.topicname=topicname;
		this.subject=subject;
	}

	@Override
	public void display() {
		System.out.println("Subject is "+subject+" and topic is "+topicname);
		
		
	}
	
}
class Topic1 implements Subject
{
	String topicname;
	String subject;
	
	Topic1(String topicname,String subject)
	{
		this.topicname=topicname;
		this.subject=subject;
	}

	@Override
	public void display() {
		System.out.println("Subject is "+subject+" and topic is "+topicname);
		
}
}
public class Loosecoupling {

	public static void main(String[] args) {
		 
		Subject s;
		s=new Topic("Independence", "History");
		s.display();
		
		s=new Topic1("OOPs","Java");
		s.display();

	}

}
