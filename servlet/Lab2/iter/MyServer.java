package com.cg.iter;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServer extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String i=req.getParameter("user");
		String j=req.getParameter("pass");
		
		req.setAttribute("user", i);  
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		req.setAttribute("pass", j);
		RequestDispatcher rd1=req.getRequestDispatcher("sq");
		rd.forward(req, res);
		rd1.forward(req, res);
	}

}
