package JdbcEmployeeProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO_Implementation implements Employee_DAO {

	public void AddEmployee(Employee_DTO employee) throws ClassNotFoundException, SQLException
	{
		Connection con=DbConnection.ConnectDataBase();
		String query="Insert Into employee values(?,?)";
		PreparedStatement smt=con.prepareStatement(query);
		smt.setInt(1,employee.getId());
		smt.setString(2,employee.getName());
		int res=smt.executeUpdate();
		if(res>0)
		{
			System.out.println("Row Added successfully!");
		}else
			System.out.println("Row Not Added!");
	}
	public void RemoveEmployee(int id) throws ClassNotFoundException, SQLException
	{
		Connection con=DbConnection.ConnectDataBase();
		String query="delete from employee where EmployeeId=?";
		PreparedStatement smt=con.prepareStatement(query);
		smt.setInt(1, id);
		int res=smt.executeUpdate();
		if(res>0)
		{
			System.out.println("Row Deleted successfully!");
		}else
			System.out.println("Row Not Deleted!");
	}
		
	
	
	public void DisplayEmployee() throws ClassNotFoundException, SQLException
	{
		Connection con=DbConnection.ConnectDataBase();
		String query="select * from employee";
		PreparedStatement smt=con.prepareStatement(query);
		ResultSet res=smt.executeQuery();
		while(res.next())
		{
			System.out.println(res.getInt("EmployeeId")+" "+res.getString("EmployeeName"));
		}
	
	}
}
	