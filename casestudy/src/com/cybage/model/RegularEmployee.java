package com.cybage.model;

public class RegularEmployee extends Employee {
	private int salary;

	public RegularEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegularEmployee(String name, String address, int salary) {
		super(name, address);
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "RegularEmployee [salary=" + salary + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int getCompensation() {
		
		return this.salary;
	}
}
