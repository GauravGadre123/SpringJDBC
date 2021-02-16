package com.techno.session2;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student st= new Student();
		st.setId(rs.getInt("id"));
		st.setName(rs.getString("name"));
		st.setCity(rs.getString("city"));
		
		
		return st;
	}

}
