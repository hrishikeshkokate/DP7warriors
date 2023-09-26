package com.lab;

class Country {
	public int id;
	public String name;

	public Country(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Player extends Country {
	public int playerId;
	public String playerName;

	public Player(int playerId, String playerName, int countryId, String countryName) {
		super(countryId, countryName);
		this.playerId = playerId;
		this.playerName = playerName;
	}
}

public class Sports {
	public static void main(String[] args) {

		Player player = new Player(101, "Hrishikesh", 1, "India");

		System.out.println("Player ID: " + player.playerId);
		System.out.println("Player Name: " + player.playerName);
		System.out.println("Player Country ID: " + player.id);
		System.out.println("Player Country Name: " + player.name);

		player.playerId = 102;
		player.playerName = "Shubham";
		player.id = 2;
		player.name = "Canada";

		System.out.println("\nUpdated Player ID: " + player.playerId);
		System.out.println("Updated Player Name: " + player.playerName);
		System.out.println("Updated Player Country ID: " + player.id);
		System.out.println("Updated Player Country Name: " + player.name);
	}
}
