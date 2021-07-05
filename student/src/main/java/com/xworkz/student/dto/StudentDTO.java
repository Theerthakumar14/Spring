package com.xworkz.student.dto;



public class StudentDTO {
	private String studentName;
	private long phoneNo;
	private String gender;
	private String dateOfBirth;
	private String email;
	private String password;
	private String course;

	public StudentDTO() {
		System.out.println("StudentDTO object is created");
	}

	public StudentDTO(String studentName, long phoneNo, String gender, String dateOfBirth, String email, String password,
			String course) {
		super();
		this.studentName = studentName;
		this.phoneNo = phoneNo;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		this.course = course;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentName=" + studentName + ", phoneNo=" + phoneNo + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email + ", password=" + password + ", course=" + course
				+ "]";
	}

	

}
