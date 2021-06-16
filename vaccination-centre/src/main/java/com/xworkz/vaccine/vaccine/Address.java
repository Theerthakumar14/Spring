package com.xworkz.vaccine.vaccine;

public class Address {
	private String street;
	private String post;
	private String district;
	private String state;
	private int pincode;

	public Address(String street, String post, String district, String state, int pincode) {
		super();
		this.street = street;
		this.post = post;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", post=" + post + ", district=" + district + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}

}
