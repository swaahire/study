package JavaDay2;

abstract public class Employee {
	
	private String ename;
	private int empId;
	private int hours;

	Employee(String ename,int empId,int hours)
	{
		this.ename=ename;
		this.empId=empId;
		this.hours=hours;
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee working hours:"+hours);
	}
abstract public int totalSalary(int Salary); 
	
}
