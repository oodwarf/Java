package com.itheima.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAssembleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans6.xml");
		UserController userController=(UserController) applicationContext.getBean("userController");
		userController.save();
	}

}
