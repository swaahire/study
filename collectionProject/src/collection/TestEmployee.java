package collection;

import java.util.*;

public class TestEmployee {
	public static void main(String[] args) {
		  Map<Employee,Integer> map=new Hashtable<Employee,Integer>();   
        Employee employee = new Employee("rajeev", 24);
        Employee employee1 = new Employee("rajeev", 25);
        Employee employee2 = new Employee("rajeev", 24);

        map.put(employee,1);  
        map.put(employee1,2);  
        map.put(employee2,3);
       
       
        System.out.println(employee.equals(employee2));
     
        System.out.println("employee.hashCode():  " + employee.hashCode()+"  employee1.hashCode():  " + employee1.hashCode()+  "  employee2.hashCode():" + employee2.hashCode());
    }

}
