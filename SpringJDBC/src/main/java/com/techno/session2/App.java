package com.techno.session2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/techno/session2/spring.xml");
		StudentDao studentDao = con.getBean("studentDao", StudentDao.class);

		Student st = new Student();
		st.setName("ganesh");
		st.setCity("pune");
		st.setId(3);

		//studentDao.insert(st);

		//studentDao.update(st);

		//studentDao.delete(3);
		
		//studentDao.getStudent(3);
		
		studentDao.getAllStudents();

	}
}
