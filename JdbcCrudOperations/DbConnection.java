package JdbcCrudOperations;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
   static Connection ConnectDataBase() throws ClassNotFoundException, SQLException {
	   Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loki_9675","root","root");
   return con;
   }
}
