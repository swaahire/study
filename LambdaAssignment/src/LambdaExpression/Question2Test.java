package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

public class Question2Test {
	public static void main(String[] args) {
	Question2 q2=new Question2(10000,"Accepted");
	Question2 q3=new Question2(15000,"Completed");
	Question2 q4=new Question2(12000,"Accepted");
	Question2 q5=new Question2(20000,"Completed");
	Question2 q6=new Question2(17000,"Accepted");
	List<Question2>list1=new ArrayList<Question2>();
	list1.add(q2);
	list1.add(q3);
	list1.add(q4);
	list1.add(q5);
	list1.add(q6);
	List<Question2> result=list1.stream()
			.filter(str->str.getPrice()>10000 && str.getStatus()=="Accepted")
			.collect(Collectors.toList());
	result.forEach(System.out::println);
	//System.out.println(result);

}
}