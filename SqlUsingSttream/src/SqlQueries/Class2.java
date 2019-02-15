package SqlQueries;

import java.util.*;

public class Class2 {
int empno,salary;
String Job,ename,mgr;
Date hiredate;
public Class2(int empno, int salary, String job, String ename, int i,
		int j) {
	super();
	this.empno = empno;
	this.salary = salary;
	this.Job = job;
	this.ename = ename;
	this.mgr = mgr;
	this.hiredate = hiredate;
}
public int getEmpno() {
	return empno;
}
public int getSalary() {
	return salary;
}
public String getJob() {
	return Job;
}
public String getEname() {
	return ename;
}
public String getMgr() {
	return mgr;
}
public Date getHiredate() {
	return hiredate;
}

}
