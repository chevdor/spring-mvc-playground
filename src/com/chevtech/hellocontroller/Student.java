package com.chevtech.hellocontroller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.*;

// more about constraints: http://docs.jboss.org/hibernate/validator/5.2/reference/en-US/html/ch02.html

public class Student {
	@Pattern(regexp="[^0-9]*")
	private String name;
	
	@Size(min=3, max=10)
	@Pattern(regexp="[^0-9]*")
	@IsValidHobby(listOfValidHobbies="Music|Ping Pong|Football")
	private String hobby;
	
	@Max(2222)
	private long mobile;
	
	@Past
	private Date dob;
	private ArrayList<String> skills;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student() {
		super();
	}
	
	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public Student(String name, String hobby) {
		super();
		this.name = name;
		this.hobby = hobby;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	

}
