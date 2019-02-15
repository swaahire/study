package ExampleofStream;

import java.util.*;
import java.util.stream.Collectors;

public class FruitTest{

	public static void main(String[] args) {
		Fruit f1=new Fruit("Mango","Yellow",125,60);
		Fruit f2=new Fruit("Apple","red",285,60);
		Fruit f3=new Fruit("Banana","Yellow",185,10);
		Fruit f4=new Fruit("Grapes","Green",205,60);
		Fruit f5=new Fruit("Stawberry","red",25,120);
		Fruit f6=new Fruit("Orange","orange",85,80);
		List<Fruit> list1=new ArrayList<Fruit>();
		list1.add(f1);
		list1.add(f2);
		list1.add(f3);
		list1.add(f4);
		list1.add(f5);
		list1.add(f6);
		System.out.println("According to calories in reversed ordeer");
		System.out.println("---------------------------------------");
		List<Fruit> slist=list1.stream()
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.collect(Collectors.toList());
		slist.forEach(e -> System.out.println("FruitName:"+e.getName()+" "+"Color:"+e.getColor()+" "+"Calories:"+e.getCalories()+" "+"Price:"+e.getPrice()));
		System.out.println("========================================");
		
		System.out.println("According to color ");
		System.out.println("--------------------------------------");
		List<Fruit> slist2=list1.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		slist2.forEach(e -> System.out.println("FruitName:"+e.getName()+" "+"Color:"+e.getColor()+" "+"Calories:"+e.getCalories()+" "+"Price:"+e.getPrice()));
		System.out.println("========================================");
		
		System.out.println("Red color fruits");
	    System.out.println("--------------------------------------");
		List<Fruit> slist3=list1.stream()
				.sorted(Comparator.comparing(Fruit::getPrice))
				.filter(str->str.getColor()=="red")
				.collect(Collectors.toList());
		slist3.forEach(e -> System.out.println("FruitName:"+e.getName()+" "+"Color:"+e.getColor()+" "+"Calories:"+e.getCalories()+" "+"Price:"+e.getPrice()));
	
	}

}
