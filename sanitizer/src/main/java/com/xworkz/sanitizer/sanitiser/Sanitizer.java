package com.xworkz.sanitizer.sanitiser;

public class Sanitizer {
	private String name;
	private double price;
	private Alcohal alcohal;
	private String brand;
	private boolean destroysBacteria;
	
	public Sanitizer(String name, double price, Alcohal alcohal, String brand, boolean destroysBacteria) {
		super();
		this.name = name;
		this.price = price;
		this.alcohal = alcohal;
		this.brand = brand;
		this.destroysBacteria = destroysBacteria;
		System.out.println(this.getClass().getSimpleName() +"object created");
	}

	@Override
	public String toString() {
		return "Sanitizer [name=" + name + ", price=" + price + ", alcohal=" + alcohal + ", brand=" + brand
				+ ", destroysBacteria=" + destroysBacteria + "]";
	}
	
	

}


