package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*
		 * Action ac = new Ram(); ac.eat(); ac.sleep(); shyam sham=new shyam();
		 * sham.eat(); sham.sleep();
		 */
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/config.xml");
		
		 // System.out.println(context);
		Ram obj =(Ram) context.getBean("ram");
		obj.eat();
		
		System.out.println(obj.getAge());
		// System.out.println(obj.getFood());
		
	}
}
