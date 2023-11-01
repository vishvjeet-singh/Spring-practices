package com.springs.Spring_JDBC;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springs/Spring_JDBC/config.xml");

		JdbcTemplate jd =  context.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jd);
	}

}
