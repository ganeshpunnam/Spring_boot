package com.example.demo.service;

public class Employee1 {
	private int id;
	private String name;
	
	private int salarey;
	private String location;
	public Employee1() {
		
	}
	public Employee1(int id, String name, int salarey, String location) {
		this.id = id;
		this.name = name;
		this.salarey = salarey;
		this.location = location;
		
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
	public int getSalarey() {
		return salarey;
	}
	public void setSalarey(int salarey) {
		this.salarey = salarey;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salarey=" + salarey + ", location=" + location + "]";
	}
	
	
}
