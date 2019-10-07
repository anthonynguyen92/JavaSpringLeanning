package DAOStudent;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import com.tutorial.Student;

public interface StudentDAO {

	public void setDataSource(DataSource dataSource);
	
	public void create(String name,Integer age);
	
	public Student getStudent(Integer ID) throws SQLException;
	
	public List<Student> listStudent();
}
