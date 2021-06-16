package com.xworkz.sanitizer.sanitiser;

public class Alcohal {
	private String name;
	private boolean containsWater;
	private double price;
	
	public Alcohal(String name, boolean containsWater, double price) {
		super();
		this.name = name;
		this.containsWater = containsWater;
		this.price = price;
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@Override
	public String toString() {
		return "Alcohal [name=" + name + ", containsWater=" + containsWater + ", price=" + price + "]";
	}
	
	

}
