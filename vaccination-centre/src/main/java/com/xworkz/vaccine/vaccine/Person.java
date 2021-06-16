package com.xworkz.vaccine.vaccine;

public class Person {

	private String name;
	private int age;
	private long mobileNo;
	private boolean personRegisteredThroughOnline;

	
	public Person(String name, int age, long mobileNo, boolean personRegisteredThroughOnline) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.personRegisteredThroughOnline = personRegisteredThroughOnline;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public boolean isPersonRegisteredThroughOnline() {
		return personRegisteredThroughOnline;
	}


	public void setPersonRegisteredThroughOnline(boolean personRegisteredThroughOnline) {
		this.personRegisteredThroughOnline = personRegisteredThroughOnline;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + ", personRegisteredThroughOnline="
				+ personRegisteredThroughOnline + "]";
	}
	

}
