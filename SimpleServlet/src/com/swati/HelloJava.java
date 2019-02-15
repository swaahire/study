package com.swati;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloJava
 */
@WebServlet("/HelloJava")
public class HelloJava extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloJava() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("Text/html");
	PrintWriter print=response.getWriter();
	String fname=request.getParameter("fname");
	String gender=request.getParameter("gender");
	String hobby=request.getParameter("hobby");
	String location=request.getParameter("city");
	
	//print.println("<html><body><table><tr><td>"+FirstName:+"</td><td>"+fname+"</td></tr>"+"<tr><td>"+Gender:+"</td><td>"+gender+"</td></tr></table></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
