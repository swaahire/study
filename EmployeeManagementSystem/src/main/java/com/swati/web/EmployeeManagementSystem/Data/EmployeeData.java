package com.swati.web.EmployeeManagementSystem.Data;

import java.util.HashMap;
import java.util.Map;

import com.swati.web.EmployeeManagementSystem.model.Employee;

public class EmployeeData {
public static Map<Integer, Employee> employee=new HashMap();
	
	public static Map<Integer, Employee> getEmployeeDetails() {
		return employee;
	}

}
