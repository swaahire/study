package JavaDay2;

public class Labour extends Employee {
	boolean isOvertime;
	int extraHours = 0;
	 public Labour(String ename, int empId,int extraHours,boolean isOvertime) {
			super(ename, empId,extraHours);
	 }


		public int totalSalary(int Salary)
	    {   
	    	int extraSalary = 0,overTimeValue=1000;
	    	 if(isOvertime==true)
	 	    {
	 	    	extraSalary=extraHours*overTimeValue+Salary;
	 		     return extraSalary;
	 	    }
	 	    else
	 	    {
	 	    	return Salary;
	 	    }
	     
	}
		
}
