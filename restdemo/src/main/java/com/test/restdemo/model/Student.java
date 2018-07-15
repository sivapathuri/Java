package com.test.restdemo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
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
	
	
}
