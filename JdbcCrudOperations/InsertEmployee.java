package JdbcCrudOperations;
import java.sql.*;
import java.util.Scanner;

public class InsertEmployee {
public static void main(String args[]) throws   Exception
{    

	Connection con=DbConnection.ConnectDataBase();
	PreparedStatement st=con.prepareStatement("insert into  Employee values(?,?)");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No Of Rows You Want To Insert :");
	int InsertRows=sc.nextInt();
	sc.nextLine();
	int res = 0;
	int RowsCount=0,i;
	for(i=0;i<InsertRows;i++)
	{
		System.out.println("Enter Employee Id :");
		int EmployeeId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Emloyee Name :");
		String EmployeeName=sc.nextLine();
		st.setInt(1,EmployeeId);
		st.setString(2,EmployeeName);
		res=st.executeUpdate();
		RowsCount++;
	}
	if(res>0)
	{
		System.out.println(i+" Rows Inserted Successfully");
	}
	else
		System.out.println("Row Is Not Inserted Successfully");
	
}
	
}
