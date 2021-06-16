package com.xworkz.supermarket.market;

public class Address {
	
	private String street;
	private int buildingNo;
	private int doorNo;
	private int pincode;

	public Address(String street, int buildingNo, int doorNo, int pincode) {
		super();
		this.street = street;
		this.buildingNo = buildingNo;
		this.doorNo = doorNo;
		this.pincode = pincode;
		System.out.println(this.getClass().getSimpleName() +"object created");
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", buildingNo=" + buildingNo + ", doorNo=" + doorNo + ", pincode="
				+ pincode + "]";
	}
	
	

}
