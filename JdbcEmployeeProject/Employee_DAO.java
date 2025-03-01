package JdbcEmployeeProject;

import java.sql.SQLException;
import java.util.List;

public interface Employee_DAO{
	void AddEmployee(Employee_DTO employee) throws ClassNotFoundException, SQLException;
	void RemoveEmployee(int id)  throws ClassNotFoundException, SQLException;
	void DisplayEmployee()  throws ClassNotFoundException, SQLException;
}