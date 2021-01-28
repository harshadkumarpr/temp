package com.cybage.service;

import java.io.IOException;

import com.cybage.EmployeeException;

public interface EmployeeService {
	public void add(String name, String address, int comp, String type)throws EmployeeException, IOException;
	public void displayAll() throws EmployeeException;
}
