package com.springs.Spring_JDBC;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApp {
	
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springs/Spring_JDBC/config.xml");

		JdbcTemplate jd =  context.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());
		
		//insert
		/*
		 * String sql = "insert into student(id, Name, address) values(?,?,?)"; int i=
		 * jd.update(sql,2,"vishvjeet","laduna");
		 * System.out.println("successfully inserted :"+i);
		 */
		
		//update
		/*
		 * String sql ="update student set Name=?, address=? where id=?"; int i=
		 * jd.update(sql, "kuku","noida",2); System.out.println("updated"+i);
		 */
		
		//delete
		String sql ="delete from student where id=?";
		int i=jd.update(sql,2);
		System.out.println("deleted : " +i);
		
	}

}
