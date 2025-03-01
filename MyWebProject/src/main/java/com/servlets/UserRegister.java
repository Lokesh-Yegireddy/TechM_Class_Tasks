package com.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class UserRegister
 */
@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserRegister() {
        super();
    
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String firstName=request.getParameter("fname");
		String secondName=request.getParameter("sname");
		String email=(String)request.getParameter("email");
		String password=(String)request.getParameter("password");
		try {
			Connection con=DbConnection.DbConnect();
			 String query="insert into Users values(?,?,?,?)";
			 PreparedStatement smt=con.prepareStatement(query);
			 smt.setString(1,firstName);
			 smt.setString(2,secondName);
			 smt.setString(3, email);
			 smt.setString(4, password);
			 int res=smt.executeUpdate();
			 if(res>0)
			 {  
				pw.print("Please Login");
				RequestDispatcher rd=request.getRequestDispatcher("login.html");
				rd.include(request, response);
			 }else {
				pw.print("Not Registered");
			 }
				 
			 
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
