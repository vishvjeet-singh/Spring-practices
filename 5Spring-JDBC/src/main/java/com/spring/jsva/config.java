package com.spring.jsva;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class config {
	
	
	@Bean
	  public DataSource getDataSource() {
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    //MySQL database we are using
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/spting_jdbc");
	    dataSource.setUsername("root");
	    dataSource.setPassword("Kuku@123");
         return dataSource;
}
	@Bean("jdbc")
	public JdbcTemplate getJdbcTemplate() {
		
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDataSource());
		return jd;
		
	}
	}
