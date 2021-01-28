package com.cybage;

import java.io.IOException;

import com.cybage.service.EmployeeService;
import com.cybage.service.EmployeeServiceImpl;

public class EmployeeTest {
	public static void main(String[] args) {
		//Employee e1=new Employee(); //empty object created
		
		//Employee e2=new Employee("hp", "gnr"); //object with value created
		
		//System.out.println(e1.getId());
		
		//System.out.println(e1);  //System.out.println(e1.toString());
		//System.out.println(e2);  //System.out.println(e2.toString());
		
//		System.out.println("------regular----");
//		Employee re=new RegularEmployee("hp2", "msn", 25000);
//		System.out.println(re);
//		
//		System.out.println("------retired----");
//		Employee reEmp=new RetiredEmployee("hp2", "msn", 1000);
//		System.out.println(reEmp);
//		
//		Employee emp=null;
//		System.out.println("------regular----");
//		emp=new RegularEmployee("abc", "ahm", 30000);
//		System.out.println(emp);
//		System.out.println("compensesition: "+emp.getCompensation());
//		
//		System.out.println("------retired----");
//		emp=new RetiredEmployee("xyz", "ahm", 2000);
//		System.out.println(emp);
//		System.out.println("compensesition: "+emp.getCompensation());
		
		EmployeeService empService=new EmployeeServiceImpl();
		try{
			empService.add("harshad", "gnr1", 30000,"REG");
		}catch(EmployeeException | IOException ee){
			System.err.println(ee.getMessage());
		}
		
		try{
			empService.add("retired2", "pune", 2000,"RET");
		}catch(EmployeeException | IOException ee){
			System.err.println(ee.getMessage());
		}
		
		try{
			empService.displayAll();
		}catch(EmployeeException ee){
			System.err.println(ee.getMessage());
		}
		

	}
}
