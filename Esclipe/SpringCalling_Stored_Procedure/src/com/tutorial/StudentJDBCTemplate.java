package com.tutorial;

import java.nio.channels.NonReadableChannelException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import DAOStudent.StudentDAO;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private SimpleJdbcCall jdbccall;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
		this.jdbccall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}

	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		String SQL = "insert into student (name,age) values (?,?)";
		jdbcTemplate.update(SQL, name, age);
		System.out.println("Done.");
		return;

	}

	@Autowired
	public Student getStudent(Integer ID) throws SQLException {
		//jdbccall.withProcedureName("getRecord").declareParameters().withoutProcedureColumnMetaDataAccess();
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", ID);
		Map<String, Object> out = jdbccall.execute(in);

		Student student = new Student();
		student.setId(ID);
		student.setName((String) out.get("out_name"));
		student.setAge((Integer) out.get("out_age"));
		return student;
	}

	

	@Override
	public List<Student> listStudent() {
		// TODO Auto-generated method stub
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
		return students;
	}
}
