package ExampleofStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrasactionTest {
public static void main(String[] args) {
	Trader trade1=new Trader("swati","pune");
	Trader trade2=new Trader("priti","Mumbai");
	Trader trade3=new Trader("chaitali","Mumbai");
	Trader trade4=new Trader("simer","Delhi");
	Trader trade5=new Trader("Abhay","Indore");
	Trader trade6=new Trader("kajal","pune");
	
	Transaction trasac=new Transaction(trade1,2011,800);
	Transaction trasac1=new Transaction(trade2,2012,1000);
	Transaction trasac2=new Transaction(trade3,2011,1200);
	Transaction trasac3=new Transaction(trade4,2015,1800);
	Transaction trasac4=new Transaction(trade5,2014,1500);
	Transaction trasac5=new Transaction(trade6,2011,1900);
	List<Transaction> list1=new ArrayList<Transaction>();
	list1.add(trasac);
	list1.add(trasac1);
	list1.add(trasac2);
	list1.add(trasac3);
	list1.add(trasac4);
	list1.add(trasac5);
	System.out.println("==========Question8================");
	List<Transaction> list2=(List<Transaction>) list1.stream().filter(i->i.getYear()==2011)
			.sorted(Comparator.comparing(Transaction::getValue))
			.collect(Collectors.toList());
	System.out.println("Transaction in the year"+list2);
	System.out.println("==========Question9================");
	List list3=list1.stream()
			.map(i->i.trader.getCity()).distinct()
			.collect(Collectors.toList());
	System.out.println("Transaction in the year"+list3);
	
	System.out.println("==========Question10================");
	list1.stream()
	.filter(i->i.trader.getCity()=="pune")
	.map(i->i.trader.getName())
	.sorted()
	.forEach(System.out::println);
			
	//("Transaction in the year"+list4);
	
	System.out.println("==========Question11================");
	list1.stream()
	.map(i->i.trader.getName())
	.sorted()
	.forEach(System.out::println);
	
	System.out.println("==========Question12================");
	list1.stream()
	.filter(i->i.trader.getCity()=="Indore")
	.forEach(System.out::println);
	System.out.println("==========Question13================");
	list1.stream()
	.filter(i->i.trader.getCity()=="Delhi")
	.forEach(System.out::println);
	System.out.println("==========Question14================");
System.out.println(list1.stream()
	     .max(Comparator.comparing(Transaction::getValue))
	 	.get().getValue());	
System.out.println("==========Question15================");
System.out.println(list1.stream()
	     .min(Comparator.comparing(Transaction::getValue))
	 	.get().getValue());	
}
}
