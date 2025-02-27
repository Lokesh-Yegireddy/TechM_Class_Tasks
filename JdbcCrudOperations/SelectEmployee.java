package JdbcCrudOperations;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEmployee {
public static void main(String args[]) throws   Exception
{
	Connection con=DbConnection.ConnectDataBase();
	PreparedStatement st=con.prepareStatement("select * from Employee");
	
	ResultSet res=st.executeQuery();
	while(res.next())
	{
		System.out.println("ID: "+res.getInt("id")+" "+"NAME: "+res.getString("name"));
	}
}
}
