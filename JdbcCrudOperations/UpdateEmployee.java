package JdbcCrudOperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class UpdateEmployee {
public static void main(String args[]) throws   Exception
{
	Connection con=DbConnection.ConnectDataBase();
	PreparedStatement st=con.prepareStatement("update Employee set name=? where id=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("Which Employee Name You Want To Update-Please Enter His Id :");	
	int EmpId=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter New Employee Name :");
	String NewEmpId=sc.nextLine();
	st.setString(1,NewEmpId);
	st.setInt(2,EmpId);
	int res=st.executeUpdate();
	if(res>0)
	{
		System.out.println("Updated Successfully");
	}
}
}
