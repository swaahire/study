package com.swati.spring.Spring_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {
	public static void main(String[] args) {
		
	       ApplicationContext context =new ClassPathXmlApplicationContext("Spring.xml");
	       
	       HelloWorld h1= context.getBean(HelloWorld.class);
	       h1.getMessage();
	    }
}
