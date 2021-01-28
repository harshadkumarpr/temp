package com.cybage.model;

public class RetiredEmployee extends Employee {
	private int pension;
	public RetiredEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RetiredEmployee(String name, String address,int pension ) {
		super(name, address);
		this.pension=pension;
		// TODO Auto-generated constructor stub
	}

	public int getPension() {
		return pension;
	}

	public void setPension(int pension) {
		this.pension = pension;
	}

	public String toString() {
		return "RetiredEmployee [pension=" + pension + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ "]";
	}

	@Override
	public int getCompensation() {
		// TODO Auto-generated method stub
		return this.pension;
	}

	
}
