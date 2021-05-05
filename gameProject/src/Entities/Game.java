package Entities;

import Abstract.Entity;

public class Game implements Entity {

	private int id;
	private String gameName;
	private int stockAmount;
	private double price;
	
	public Game() {
		
	}
	
	public Game(int id, String gameName, int stockAmount, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.stockAmount = stockAmount;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
