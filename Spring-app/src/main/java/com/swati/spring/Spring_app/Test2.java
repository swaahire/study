package com.swati.spring.Spring_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("spring2.xml");
		Question quest=context.getBean(Question.class);
		/*quest.getAnswerList();
		quest.getAnswerMap();
		quest.getAnswerSet();
		quest.getQuestion();
		quest.getQuestionId();*/
		System.out.println(quest);
}
}