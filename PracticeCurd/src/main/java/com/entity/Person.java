package com.entity;

public class Person {
	
	private int id;
	private String name;
	private String dob;
	private String email;
	private String qualification;
	private String bloodgroup;
	private String course;
	private String contactnumber;
	
	
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public Person(int id, String name, String dob, String email, String qualification, String bloodgroup, String course,
			String contactnumber) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.qualification = qualification;
		this.bloodgroup = bloodgroup;
		this.course = course;
		this.contactnumber = contactnumber;
	}
	public Person(String name, String dob, String email, String qualification, String bloodgroup, String course,
			String contactnumber) {
		super();
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.qualification = qualification;
		this.bloodgroup = bloodgroup;
		this.course = course;
		this.contactnumber = contactnumber;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", qualification="
				+ qualification + ", bloodgroup=" + bloodgroup + ", course=" + course + ", contactnumber="
				+ contactnumber + "]";
	}
	
	
	
	

}
