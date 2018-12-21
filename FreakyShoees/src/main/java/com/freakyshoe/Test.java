package com.freakyshoe;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.freakyshoe.bean.UserBean;
import com.freakyshoe.dao.UserDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		UserDao dao= context.getBean(UserDao.class);
	   
		dao.delete(new UserBean(12, "simer", "123"));
		
	}
}
