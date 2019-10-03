package com.tutorial.DAO;

import java.util.List;

import javax.sql.DataSource;

import com.tutorial.Student;

public interface StudentDAO {

	/*
	 * the function u can create database 
	 * */
	public void setDataSource(DataSource dtSource);
	
	/*
	 * function add/create data into database
	 * */
	
	public void createData(String name,Integer age );
	
	/*
	 * getter A student
	 * */
	
	public Student getStudent(Integer ID);
	
	/*
	 * delete Student
	 * */
	
	public void deleteStudent(Integer ID);


	/*
	 * 
	 * */
	
	public List<Student> listStudent();
	
	public void update(Integer ID,Integer age);
	
}
