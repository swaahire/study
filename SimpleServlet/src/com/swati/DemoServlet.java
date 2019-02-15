package com.swati;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
	public class DemoServlet extends HttpServlet{
	   public void doGet(HttpServletRequest request,HttpServletResponse response)
	   throws ServletException,IOException
	   {
	       response.setContentType("text/html");
	       PrintWriter pwriter=response.getWriter();

	       //ServletContext object creation
	       ServletContext scontext=getServletContext();

	       //fetching values of initialization parameters and printing it
	       String userName=scontext.getInitParameter("uname");
	       pwriter.println("User name is="+userName);
	       String userEmail=scontext.getInitParameter("email");
	       pwriter.println("Email Id is="+userEmail);
	       pwriter.close();
	   }
}

