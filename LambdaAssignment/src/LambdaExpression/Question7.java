package LambdaExpression;

import java.util.*;
import java.util.stream.Collectors;

public class Question7 {
	public static void main(String[] args) {
		
	List <String> list1=new ArrayList<String>();
	Map<String,Integer>map=new HashMap();
	map.put("ABC",65479821);
	map.put("gfaeC",23145678);
	map.put("jhare",221457);
	
	map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
    .forEach(e -> System.out.println("Key: "+ e.getKey() +"Value: "+ e.getValue()));
	

}
}