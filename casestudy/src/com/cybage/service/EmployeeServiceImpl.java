package com.cybage.service;

import java.io.IOException;

import com.cybage.EmployeeException;
import com.cybage.dao.EmployeeDao;
import com.cybage.dao.EmployeeDaoImpl;
import com.cybage.model.Employee;
import com.cybage.model.RegularEmployee;
import com.cybage.model.RetiredEmployee;

public class EmployeeServiceImpl implements EmployeeService {
	//initialisation block
	
	Employee emp[] = new Employee[10];
	public static int count=0;
	EmployeeDao dao=new EmployeeDaoImpl();
	
	@Override
	public void add(String name, String address, int comp, String type)throws EmployeeException,IOException {
		System.out.println("adding new Employee");
		
		if(name == null){
			throw new EmployeeException("Name cannot be blank");
		}
		if(address== null){
			throw new EmployeeException("address cannot be blank");
		}
		if(comp < 0 ){
			throw new EmployeeException("Componsesation  cannot be negative");
		}
		
		if(type.equals("REG")){
		
		dao.add(new RegularEmployee(name,address,comp));
		}
		else if(type.equals("RET"))
		{
		
			dao.add(new RetiredEmployee(name,address,comp));
		}
	}

	@Override
	public void displayAll() throws EmployeeException {
		if(count <=0){
			throw new EmployeeException("there are no records in database");
		}
		
		for(Employee e: emp){
			if(e != null){
				System.out.println("Id: "+e.getId()+" compensation: "+e.getCompensation());
			}
		}
		
	}

}
