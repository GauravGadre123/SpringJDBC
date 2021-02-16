package com.techno.session2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Student st) {
		System.out.println(st.getName() + " " + st.getCity());
		String query1 = "insert into student(name,city) values(?,?)";
		int result = jdbcTemplate.update(query1, st.getName(), st.getCity());
		System.out.println(result + " rows inserted");
	}

	public void update(Student st) {
		String query2 = "update student set name=?,city=? where id=?";
		int result = jdbcTemplate.update(query2, st.getName(), st.getCity(), st.getId());
		System.out.println(result + " rows updated");
	}

	public void delete(int id) {
		String query3 = "delete from student where id=?";
		int result =jdbcTemplate.update(query3, id);
		System.out.println(result + " rows deleted");

	}
	
	public void getStudent(int id) {
		String query4 = "select *  from student where id=?";
		RowMapperImpl rowMapper= new RowMapperImpl();
		Student student = jdbcTemplate.queryForObject(query4, rowMapper,id);
		System.out.println(student);
	}

	public void getAllStudents() {
		String query5 = "select *  from student";
		RowMapperImpl rowMapper= new RowMapperImpl();
		List<Student> students = jdbcTemplate.query(query5, rowMapper);
		System.out.println(students);
	}
}
