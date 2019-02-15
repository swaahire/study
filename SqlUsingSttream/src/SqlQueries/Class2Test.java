package SqlQueries;

import java.util.*;
import java.util.stream.Collectors;

public class Class2Test {
public static void main(String[] args) {
	Class2 cls=new Class2(7369,20000,"clerk","John",7902,17-12-80);
	Class2 cls1=new Class2(7349,40000,"Manager","Swati",7602,20-02-81);
	Class2 cls2=new Class2(7229,80000,"Research","Priti",7442,02-04-81);
	List<Class2> list1=new ArrayList<Class2>();
	list1.add(cls);
	list1.add(cls1);
	list1.add(cls2);
	list1.stream()
	.map(dept->dept.getEname())
	.forEach(System.out::println);
}
}
