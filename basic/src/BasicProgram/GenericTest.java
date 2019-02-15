package BasicProgram;

import java.util.*;
public class GenericTest {
	public static void main(String[] args) {
		MyList<Person> list1=new MyList<Person>();
		Person person=new Person(12344566); 
		Person person2=new Person(1213452);
		list1.add(person);
		list1.add(person2);
		System.out.println(list1.get());
		
		MyList<Employee> list2=new MyList<Employee>();
		Employee emp=new Employee("swati");
		Employee emp2=new Employee("priti");
		list2.add(emp);
		list2.add(emp2);
	}
	  
		
}
