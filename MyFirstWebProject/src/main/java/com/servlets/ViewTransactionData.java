package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

/**
 * Servlet implementation class ViewTransactionData
 */
@WebServlet("/ViewTransactionData")
public class ViewTransactionData extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ViewTransactionData() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
        
		HttpSession hs = request.getSession();
		int noOfPages = (int) hs.getAttribute("totPages");
		ResultSet rs = (ResultSet) hs.getAttribute("tableData");
		int currentPage = (int) hs.getAttribute("page");
		pw.print("<h1>Page No : "+currentPage+"</h1>");
		try {
			pw.print("<table border=2>");
			pw.print("<tr>");
			pw.print("<th>Transaction_Id</th>");
			pw.print("<th>Transaction_Date</th>");
			pw.print("<th>Transaction_Amt</th>");
			pw.print("<th>Source_Account_Id</th>");
			pw.print("<th>Destination_Account_Id</th>");
			pw.print("</tr>");

			// Display the transaction records in the table
			while (rs.next()) {
				pw.print("<tr>");
				pw.print("<td>" + rs.getInt(1) + "</td>");
				pw.print("<td>" + rs.getString(2) + "</td>");
				pw.print("<td>" + rs.getInt(3) + "</td>");
				pw.print("<td>" + rs.getInt(4) + "</td>");
				pw.print("<td>" + rs.getInt(5) + "</td>");
				pw.print("</tr>");
			}
			pw.print("</table>");
		
			pw.print("<div>");
			// Previous page link
			
			if (currentPage > 1) {
				pw.print("<a href='Transactions?page=" + (currentPage - 1) + "'><< Previous</a> ");
			} else {
				pw.print("<span><< Previous</span> ");
			}
			            // Next page link
						if (currentPage < noOfPages) {
							pw.print("<a href='Transactions?page=" + (currentPage + 1) + "'>Next >></a>");
						} else {
							pw.print("<span>Next >></span>");
						}
                         
						pw.print("</div>");
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

	}

}