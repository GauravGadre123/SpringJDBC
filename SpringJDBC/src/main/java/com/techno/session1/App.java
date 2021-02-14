package com.techno.session1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/techno/session1/spring.xml");
		JdbcTemplate bean = con.getBean("jdbcTemplate", JdbcTemplate.class);

		// To insert data

		// String query1 = "insert into student(name,city) values(?,?)";
		// int result = bean.update(query1,"ramesh","mumbai");
		// System.out.println(result + " rows inserted");

		// To update data
		// String query2 = "update student set name=?,city=? where id=?";
		// int result = bean.update(query2, "rakesh", "pune", 2);
		// System.out.println(result + " rows updated");

		// To delete data
		String query3 = "delete from student where id=?";
		int result = bean.update(query3, 1);
		System.out.println(result + " rows deleted");

	}
}
