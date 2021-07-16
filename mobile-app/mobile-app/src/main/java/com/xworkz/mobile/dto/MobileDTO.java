package com.xworkz.mobile.dto;

public class MobileDTO {
	private String name;
	private String brand;
	private int ram;
	private double price;
	
	public MobileDTO() {
		System.out.println("MobileDTO object is created");
	}

	public MobileDTO(String name, String brand, int ram, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.price = price;
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

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MobileDTO [name=" + name + ", brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

	
	
}
