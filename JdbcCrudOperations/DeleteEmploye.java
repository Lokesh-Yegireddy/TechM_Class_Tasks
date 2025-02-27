package JdbcCrudOperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DeleteEmploye {
public static void main(String args[]) throws   Exception
{
	Connection con=DbConnection.ConnectDataBase();
	PreparedStatement st=con.prepareStatement("delete from Employee where id=?");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter How Many Rows You Want To Delete :");
	int RemoveRows=sc.nextInt();
	sc.nextLine();
	int res=0,i;
	for( i=0;i<RemoveRows;i++) {
		System.out.println("Enter Employee Id To delete Employee");
		int EmpId=sc.nextInt();
		st.setInt(1, EmpId);
		 res=st.executeUpdate();
	}
	
	if(res>0)
	{
		System.out.println("Deleted "+i+" row Successfully");
	}
}
}
