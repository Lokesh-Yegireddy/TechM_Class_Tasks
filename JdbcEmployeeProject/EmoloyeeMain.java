package JdbcEmployeeProject;

import java.sql.SQLException;
import java.util.Scanner;

public class EmoloyeeMain {
public static void main(String args[]) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	EmployeeDAO_Implementation empDAO=new EmployeeDAO_Implementation();
	Employee_DTO employee=new Employee_DTO(1,"jhon");
	empDAO.AddEmployee(employee);
	empDAO.DisplayEmployee();
	System.out.println("Enter Employee Id U Want To Delete :");
	int id=sc.nextInt();
	empDAO.RemoveEmployee(id);
	empDAO.DisplayEmployee();
}
}