package ExampleofStream;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewsPaperTest {
public static void main(String[] args) {
	NewsPaper nf=new NewsPaper(101,"swati","Priti","What is the budget of your project");
	NewsPaper nf1=new NewsPaper(111,"chaitali","Priti","Nice");
	NewsPaper nf2=new NewsPaper(111,"chaitali","Priti","What is the budget of your project");
	NewsPaper nf3=new NewsPaper(121,"Priti","swati","Nice");
	NewsPaper nf4=new NewsPaper(101,"swati","chaitali","But this budget is too high");
	List<NewsPaper> list1=new ArrayList<NewsPaper>();
	list1.add(nf);
	list1.add(nf1);
	list1.add(nf2);
	list1.add(nf3);
	list1.add(nf4);
	//Questipon4
	System.out.println("==========Question4================");
	Map<Object, Long> map = list1.stream() 
			 .collect(Collectors.groupingBy(i->i.getNewsId(), Collectors.counting())); 
	long maxvalue=0;
	int keyvalue=0;
	
	for (Entry<Object, Long> entry : map.entrySet()) {
		if(entry.getValue()>maxvalue){
			maxvalue=entry.getValue();
			keyvalue=(int) entry.getKey();
		}
    }
	System.out.println("Maximum number of comments:"+maxvalue);
	System.out.println("==========Question5================");
	
	//Question5
	long question5=list1.stream()
			.filter(str->str.getComment().contains("budget")).count();
			
	System.out.println("Occurence of budget in comment:"+question5);
	 

	//Question6
	System.out.println("==========Question6================");
Map<Object, Long> question6 = list1.stream() 
.collect(Collectors.groupingBy(i->i.getCommentByUser(), Collectors.counting())); 
//System.out.println("Comments by user"+question6);
long maxval=0;
Object keyval=0;

for (Entry<Object, Long> entry : question6.entrySet()) {
	if(entry.getValue()>maxval){
		maxval=entry.getValue();
		keyval= entry.getKey();
	}
}	
System.out.println("User "+keyval+" posted maximum number of comments that is : "+maxval);
}
}
