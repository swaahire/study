package JavaDay2;

public class Manager extends Employee {
	private int incentive=20000;
    public Manager(String ename, int empId,int hours) {
		super(ename, empId,hours);
    }
    public int totalSalary(int Salary)
    {
    	int totalSalary;
     totalSalary=incentive+Salary;
     return totalSalary;
   	}
}
 


