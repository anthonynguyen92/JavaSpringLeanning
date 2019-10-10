package com.tutorial.DAO;

import java.util.List;

import javax.sql.DataSource;

import com.tutorial.StudentMarks;


public interface StudentDAO {
	public void setDatasource(DataSource dataSource);
	public void create (String name, Integer age, Integer mark,Integer year);
	public List<StudentMarks> liststudents(); 
}
