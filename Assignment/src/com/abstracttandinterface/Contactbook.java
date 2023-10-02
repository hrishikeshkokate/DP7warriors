package com.abstracttandinterface;

interface PhoneBookEntry {

	String getName();

	void setName(String name);

	String getContact();

	void setContact(String contact);
}

class OpenPhoneBook implements PhoneBookEntry {
	private String name;
	private String contact;

	
	public OpenPhoneBook(String name, String contact) {
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getContact() {
		return contact;
	}

	@Override
	public void setContact(String contact) {
		this.contact = contact;
	}

	public void displayEntry() {
		System.out.println("Name: " + name);
		System.out.println("Contact: " + contact);
	}

	public static void main(String[] args) {
		
		OpenPhoneBook entry1 = new OpenPhoneBook("John Doe", "123-456-7890");
		OpenPhoneBook entry2 = new OpenPhoneBook("Jane Smith", "987-654-3210");

		
		System.out.println("Phone Book Entry 1:");
		entry1.displayEntry();

		System.out.println("\nPhone Book Entry 2:");
		entry2.displayEntry();
	}
}
