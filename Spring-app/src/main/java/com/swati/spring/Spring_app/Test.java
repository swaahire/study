package com.swati.spring.Spring_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
	Customer cust=context.getBean(Customer.class);
	cust.print();
}
}
