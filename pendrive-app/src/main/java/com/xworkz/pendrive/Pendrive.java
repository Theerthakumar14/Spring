package com.xworkz.pendrive;

public class Pendrive {
	private String name;
	private String color;
	private int storage;
	private double price;

	public Pendrive() {
		System.out.println("default constructor called");

	}

	public Pendrive(String name, String color, int storage, double price) {
		System.out.println("Parameter constructor called");
		this.name = name;
		this.color = color;
		this.storage = storage;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pendrive [name=" + name + ", color=" + color + ", storage=" + storage + ", price=" + price + "]";
	}
	
	
	

}
