package com.cg.iter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServer2 extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		String k=(String) req.getAttribute("user");
		String k1=(String) req.getAttribute("pass");
		
		if(k.equals("Ashmita") && k1.equals("1234"))
		{
			PrintWriter out=res.getWriter();
			out.print("Success");
		}
		else
		{
			PrintWriter out=res.getWriter();
			out.print("Failure");
		}
		System.out.println("hi");
		
		
	}

}
