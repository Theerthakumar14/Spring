package com.xworkz.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;



@Entity
@Table(name="mobile_table")
@NamedQuery(name="mobileEntityByName", query="from MobileEntity as mobile where mobile.name=:mName")
@NamedQuery(name="getMobileDetails", query="from MobileEntity")
public class MobileEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MOBILE_ID")
	private int id;
	
	@Column(name="MOBILE_NAME")
	private String name;
	
	@Column(name="MOBILE_BRAND")
	private String brand;
	
	@Column(name="MOBILE_RAM")
	private int ram;
	
	@Column(name="MOBILE_PRICE")
	private double price; 
	
	
	public MobileEntity() {
	}

	public MobileEntity(String name, String brand, int ram, double price) {
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
		return "MobileEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", ram=" + ram + ", price=" + price
				+ "]";
	}




}
