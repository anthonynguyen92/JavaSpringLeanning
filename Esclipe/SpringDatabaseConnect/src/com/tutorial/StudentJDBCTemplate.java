package com.tutorial;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.tutorial.DAO.StudentDAO;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void createData(String name,Integer age ) {
		String queryString = "INSERT INTO student (name,age) VALUES (?,?)";
		jdbcTemplate.update(queryString, name, age);
		System.out.println("Created Record Name: " + name + " Age: " + age);
		//return;
	}

	public Student getStudent(Integer ID) {
		String sqlString = "SELECT * FROM student WHERE ID = ?";
		Student student = jdbcTemplate.queryForObject(sqlString, new Object[] { ID }, new StudentMapper());
		return student;
	}

	public List<Student> listStudent() {
		String sql = "SELECT * FROM student";
		java.util.List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
		return students;
	}

	public void update(Integer ID, Integer age) {
		String SQL = "update student set age = ? where id = ?";
		jdbcTemplate.update(SQL, age, ID);
		System.out.println("Record had been changed.");
	}

	public void deleteStudent(Integer ID) {
		String SQL = "DELETE FROM student WHERE ID = ?";
		jdbcTemplate.update(SQL, ID);
		System.out.println("Record Had been delete.");
	}

}
