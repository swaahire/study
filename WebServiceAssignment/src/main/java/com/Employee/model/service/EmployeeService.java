package com.Employee.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.Employee.model.Employee;
import com.Employee.model.data.EmployeeData;

public class EmployeeService {
	public Map<Integer, Employee> employees = EmployeeData.getEmployeeDetails();

	public EmployeeService() {
		employees.put(101, new Employee(101, "swati", "Management", "Manager",50000));
		employees.put(102, new Employee(102, "priti", "Operation","Consultant", 50000));
		employees.put(103, new Employee(103, "chaitali", "Research","Research", 40000));
		employees.put(104, new Employee(104, "simer", "Sales", "SalesMan", 2000));
	}

	public List<Employee> getAllEmployees() {
		return new ArrayList<Employee>(employees.values());
	}

	public Employee addEmployee(Employee employee) {
		employee.setEmployeeId(employees.size() + 1);
		employees.put(employee.getEmployeeId(), employee);
		return employee;
	}

	public Employee removeEmployee(int employeeId) {
		return employees.remove(employeeId);
	}

	public Employee getEmployee(long id){	
		Employee obj=null;
		obj=employees.get(id);
		
		return obj;
	}
}