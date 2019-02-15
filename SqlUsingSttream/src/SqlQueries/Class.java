package SqlQueries;

import java.util.*;
import java.util.stream.Collectors;

public class Class {
	public static void main(String[] args) {
		List<String> department = Arrays.asList("Manager","Clerk","Accountant","Research","Operation");
		List<String> result=department.stream()
				.map(dept->dept)
				.collect(Collectors.toList());
		department.forEach(System.out::println);
	
		
	}
	
}
