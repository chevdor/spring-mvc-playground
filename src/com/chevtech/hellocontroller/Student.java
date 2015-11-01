package com.chevtech.hellocontroller;

public class Student {
	public Student() {
		super();
	}
	
	public Student(String name, String hobby) {
		super();
		this.name = name;
		this.hobby = hobby;
	}
	private String name;
	private String hobby;
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
