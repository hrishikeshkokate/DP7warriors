package com.abstracttandinterface;

abstract class WiFiNetwork {
	protected String ssid;
	protected String password;

	public WiFiNetwork(String ssid, String password) {
		this.ssid = ssid;
		this.password = password;
	}

	protected void connectToWiFi() {
		System.out.println("WiFi network: " + ssid);
	}

	protected abstract void accessFromAdjacentRoom();

	protected abstract void accessFromInsideRoom();
}

class EmployeeWiFi extends WiFiNetwork {
	public EmployeeWiFi(String ssid, String password) {
		super(ssid, password);
	}

	@Override
	protected void accessFromAdjacentRoom() {
		connectToWiFi();
		System.out.println("Accessing WiFi from the adjacent room.");
	}

	@Override
	protected void accessFromInsideRoom() {
		connectToWiFi();
		System.out.println("Accessing WiFi from inside the room.");
	}
}

class AdminWiFi extends WiFiNetwork {
	public AdminWiFi(String ssid, String password) {
		super(ssid, password);
	}

	@Override
	protected void accessFromAdjacentRoom() {
		connectToWiFi();
		System.out.println("Accessing WiFi from the adjacent room.");
	}

	@Override
	protected void accessFromInsideRoom() {
		connectToWiFi();
		System.out.println("Accessing WiFi from inside the room.");
	}
}

public class Thinkquotient {
	public static void main(String[] args) {

		WiFiNetwork w;
		// Create an Employee WiFi network
		w = new EmployeeWiFi("EmployeeWiFi", "employeePassword");
		System.out.println("Employe wifi");
		w.accessFromAdjacentRoom();
		System.out.println();
		w.accessFromInsideRoom();
		System.out.println("_____________________________");

		// Create an Admin WiFi network
		w = new AdminWiFi("AdminWiFi", "adminPassword");
		System.out.println("Admin wifi");
		w.accessFromAdjacentRoom();
		System.out.println();
		w.accessFromInsideRoom();
	}
}
