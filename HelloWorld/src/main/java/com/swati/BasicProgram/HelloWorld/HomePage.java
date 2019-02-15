package com.swati.BasicProgram.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomePage {
	public static void main(String[] args) {
		
	       ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
	       
	       Hello h1= (Hello) context.getBean("account");
	       h1.getMessage();
	    }
}