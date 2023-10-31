package com.auto.xml;

import java.net.ContentHandlerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/auto/xml/config.xml");
		
		Student st= (Student) context.getBean("st");
		System.out.println(st);
	}
	
}
