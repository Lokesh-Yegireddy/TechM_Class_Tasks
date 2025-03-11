package com.servlets;
import java.sql.*;
public class DbConnection {
	public static Connection DbConnect() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loki_9675","root","root");
		   return con;
	}
  
   
}
