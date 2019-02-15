package LambdaExpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question3 {
public static void main(String[] args) {
	
	Predicate<Integer> lessthan=i->i<10;
	System.out.println("Predicate Result:"+lessthan.test(20));
	
	Consumer<Integer> printprice=i->System.out.println("Consumer result:"+i);
    printprice.accept(10);

	Function<Integer,Double> value=f->f+12.5;
	System.out.println("function result:"+value.apply(100));
	
	String str1="Swati";
	Supplier<String> greet=()->"Hello";
	System.out.println("Supplier result:"+str1+" "+greet.get());
	};
}	

