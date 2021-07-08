package com.xworkz.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="mobile_table")
public class MobileEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MOBILE_ID")
	private int id;
	
	@Column(name="MOBILE_NAME")
	private String name;
	
	@Column(name="MOBILE_BRAND")
	private String brand;
	
	@Column(name="MOBILE_RAM")
	private String ram;
	
	@Column(name="MOBILE_PRICE")
	private String price; 
	
	
	public MobileEntity() {
	}

	public MobileEntity(String name, String brand, String ram, String price) {
		super();
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MobileEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", ram=" + ram + ", price=" + price
				+ "]";
	}
	

}
