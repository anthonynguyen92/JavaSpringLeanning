package com.tutorial;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.tutorial.DAO.StudentDAO;

public class StudentJDBCTemplate implements StudentDAO {

	@SuppressWarnings("unused")
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager transactionManager;

	@Override
	public void setDatasource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);

	}
	
	public DataSource getDataSource() {
		return this.dataSource;
	}
	
	
	public void setDataTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public void create(String name, Integer age, Integer mark, Integer year) {
		// TODO Auto-generated method stub

		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);
		try {
			String SQL1 = "insert into student(name,age) values (?,?)";
			jdbcTemplate.update(SQL1, name, age);

			// get the last student
			String SQL2 = "Select max (id) from student";
			@SuppressWarnings("deprecation")
			int sid = jdbcTemplate.queryForInt(SQL2);

			String SQL3 = "Insert into marks(sid,mark year) values(?,?,?)";
			jdbcTemplate.update(SQL3, sid, mark, year);

			System.out.println("created Name: " + name + ",Age: " + age);
			transactionManager.commit(status);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erorr in creating record, rolling back");
			transactionManager.rollback(status);
			throw e;
		}
	}

	@Override
	public List<StudentMarks> liststudents() {
		// TODO Auto-generated method stub

		String SQL = "select * from student,marks where student.id= marks.id";
		List<StudentMarks> studentMarks = jdbcTemplate.query(SQL, new StudentMarkMapper());
		return studentMarks;
	}

}
