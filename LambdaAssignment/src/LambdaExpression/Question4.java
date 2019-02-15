package LambdaExpression;

import java.util.*;

public class Question4 {
public static void main(String[] args) {
	List<String> list1=new ArrayList<String>();
	list1.add("Swati");
	list1.add("Chaitali");
	list1.add("priti");
	list1.add("Poojitha");
	
	
	list1.removeIf(str->str.length()%2!=0);
	System.out.println("Result"+list1);
	
	
}
}
