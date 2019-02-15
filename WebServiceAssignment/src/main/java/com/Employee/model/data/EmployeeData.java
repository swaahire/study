package com.Employee.model.data;

import java.util.HashMap;
import java.util.Map;

import com.Employee.model.Employee;

public class EmployeeData {
	public static Map<Integer, Employee> employee=new HashMap();
	
	public static Map<Integer, Employee> getEmployeeDetails() {
		return employee;
	}

}
