package LambdaExpression;

import java.util.Scanner;

public class Question1  {
@FunctionalInterface
	public interface Calculate {
			int calculate(int a,int b);
	}
	public static void main(String[] args) {
		
		Calculate add=(a,b)->a+b;
		int result=add.calculate(5,6);
		System.out.println(result);
		Calculate sub=(int a,int b)->a-b;
		int result1=sub.calculate(5,6);
		System.out.println(result1);
		Calculate mul=(int a,int b)->a*b;
		int result2=mul.calculate(5,6);
		System.out.println(result2);
		Calculate div=(int a,int b)->a/b;
		int result3=div.calculate(5,6);
		System.out.println(result3);
	}

}
