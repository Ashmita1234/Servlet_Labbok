package com.cg.iter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrentDate extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      
		      // Set response content type
		      response.setContentType("text/html");
		 
		      PrintWriter out = response.getWriter();
		      String title = "Display Current Date & Time";
		      Date date = new Date();
		      
		      out.println(
		         "<html><body bgcolor = \"pink\"> <h1 align = \"center\"></h1><h2>"+date.toString()+"</h2></body></html>");
		   }
}
