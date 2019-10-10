package com.tutorial;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentMarkMapper implements org.springframework.jdbc.core.RowMapper<StudentMarks> {
	@Override
	public StudentMarks mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		StudentMarks studentMarks = new StudentMarks();
		studentMarks.setId(rs.getInt("id"));
		studentMarks.setAge(rs.getInt("age"));
		studentMarks.setMark(rs.getInt("mark"));
		studentMarks.setName(rs.getString("name"));
		studentMarks.setSid(rs.getInt("sid"));
		studentMarks.setYear(rs.getInt("year"));
		return null;
	}

}
