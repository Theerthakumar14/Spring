package com.xworkz;

public class Chacolate {
	private String name;
	private String brand;
	private String size;
	private double price;

	public Chacolate() {
		System.out.println("zero parameterised constructor");
	}

	public Chacolate(String name, String brand, String size, double price) {
		System.out.println("parametrised constructor");
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.price = price;
	}

	public Chacolate(String name, String brand) {
		System.out.println("two paramtrised constructor");
		this.name = name;
		this.brand = brand;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void taste() {
		System.out.println("invoked taste method");
		System.out.println("chacolate taste is good");
	}

	public void stressReliever() {
		System.out.println("eat chacolate to reduce the stress");
	}

	@Override
	public String toString() {
		System.out.println("toString method override");
		return "Chacolate [name=" + name + ", brand=" + brand + ", size=" + size + ", price=" + price + "]";
	}

}
