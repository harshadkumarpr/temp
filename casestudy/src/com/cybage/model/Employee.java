package com.cybage.model;

public abstract class Employee { //
	//properties
	private int id;
	private String name;
	private String address;
	
	private int generateId(){
		return (int) (Math.round(Math.random()*1000));
	}
	
	//constuctor, constuctor over
	public Employee(){
		System.out.println("Empty object created");
		this.id = generateId();
		this.name= null;
		this.address = null;
	}
	public Employee(String name, String address){ //
		System.out.println(" object with value created");
		this.id = generateId();
		this.name= name;
		this.address = address;
	}
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Employee [id: "+this.id+ ", name: "+ this.name+ ", address: "+this.address+ "]";
	}
	public abstract int getCompensation(); //no definition
	
}
