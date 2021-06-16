package com.xworkz.vaccine.vaccine;

public class VaccinationCentre {

	private String centreName;
	private Address address;
	private Person vaccinatedPerson;
	private String vaccineType;
	private boolean vaccineIsFree;

	public VaccinationCentre(String centreName, Address address, Person vaccinatedPerson, String vaccineType,
			boolean vaccineIsFree) {
		super();
		this.centreName = centreName;
		this.address = address;
		this.vaccinatedPerson = vaccinatedPerson;
		this.vaccineType = vaccineType;
		this.vaccineIsFree = vaccineIsFree;
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Person getVaccinatedPerson() {
		return vaccinatedPerson;
	}

	public void setVaccinatedPerson(Person vaccinatedPerson) {
		this.vaccinatedPerson = vaccinatedPerson;
	}

	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	public boolean isVaccineIsFree() {
		return vaccineIsFree;
	}

	public void setVaccineIsFree(boolean vaccineIsFree) {
		this.vaccineIsFree = vaccineIsFree;
	}

	@Override
	public String toString() {
		return "VaccinationCentre [centreName=" + centreName + ", address=" + address + ", vaccinatedPerson="
				+ vaccinatedPerson + ", vaccineType=" + vaccineType + ", vaccineIsFree=" + vaccineIsFree + "]";
	}

}
