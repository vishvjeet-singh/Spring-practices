package com.spring.jsva;

import java.sql.SQLException;

import javax.activation.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) throws SQLException {

		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
	JdbcTemplate jd	=context.getBean("jdbc",JdbcTemplate.class);
	
	System.out.println(jd.getDataSource().getConnection());
	
	String sql = "insert into student(id, Name, address) values(?,?,?)";
	int i= jd.update(sql,1,"vishvjeet","laduna");
	System.out.println("successfully inserted :"+i);
	
		
	}

}
