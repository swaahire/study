package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Question6 {
	public static void main(String[] args) {
		
		UnaryOperator<String> result=str->str.toUpperCase();
		System.out.println((result).apply("swati"));
		System.out.println((result).apply("priti"));
		System.out.println((result).apply("chaitali"));
		
	}

}
