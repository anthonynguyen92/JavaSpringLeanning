package com.tutorial;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentMapper implements org.springframework.jdbc.core.RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setID(rs.getInt("id"));
		student.setAge(rs.getInt("age"));
		student.setName(rs.getString("name"));

		return student;

	}

}
