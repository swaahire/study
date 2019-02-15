package com.swati.web.EmployeeManagementSystem.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.swati.web.EmployeeManagementSystem.model.Employee;
import com.swati.web.EmployeeManagementSystem.service.EmployeeService;


	@Path("/EmployeeSystem")
	public class EmployeeResource {
		EmployeeService empservice = new EmployeeService();

		@GET
		@Path("/getallemployee")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Employee> getEmployees() {
			return empservice.getAllEmployees();
		}
		@GET
		@Path("search/{empoloyeeId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Employee getEmployee(@PathParam("employeeId") int empid) {
			return empservice.getEmployee(empid);
		}
		@GET
		@Path("remove/{empoloyeeId}")
		@Produces(MediaType.APPLICATION_JSON)
		public Employee removeEmployee(@PathParam("employeeId") int employeeId ){
			return empservice.removeEmployee(employeeId);
		}
		
}
