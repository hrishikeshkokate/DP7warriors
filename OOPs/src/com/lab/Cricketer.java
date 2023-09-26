package com.lab;

public class Cricketer {
	private int playerID;
	private String name;
	private boolean isBowler;
	private float strikeRate;
	private int runs;

	public Cricketer() {

	}

	public Cricketer(int playerID, String name, boolean isBowler, float strikeRate, int runs) {
		this.playerID = playerID;
		this.name = name;
		this.isBowler = isBowler;
		this.strikeRate = strikeRate;
		this.runs = runs;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBowler() {
		return isBowler;
	}

	public void setBowler(boolean bowler) {
		isBowler = bowler;
	}

	public float getStrikeRate() {
		return strikeRate;
	}

	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String toString() {
		return "playerID=" + playerID + " \nname='" + name + "\nisBowler=" + isBowler + "\n strikeRate=" + strikeRate
				+ "\n runs=" + runs + '}';
	}

	public static void main(String[] args) {

		Cricketer c = new Cricketer();
		c.setPlayerID(7);
		c.setName("Virat Kolhi");
		c.setBowler(false);
		c.setStrikeRate(8.6f);
		c.setRuns(25000);

		System.out.println("Player ID: " + c.getPlayerID());
		System.out.println("Name: " + c.getName());
		System.out.println("Is Bowler: " + c.isBowler());
		System.out.println("Strike Rate: " + c.getStrikeRate());
		System.out.println("Runs: " + c.getRuns());
	}
}
