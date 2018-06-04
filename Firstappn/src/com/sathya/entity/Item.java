package com.sathya.entity;

public class Item {
	private int itemId;
	private String itemName;
	private double price;

	// default constructor
	public Item() {

	}

	// minimal constructor
	public Item(int itemId) {
		this.itemId = itemId;

	}
	
	// full constructor
	public Item(int itemId, String itemName, double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	// setters and getters

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + "]";
	}

}
