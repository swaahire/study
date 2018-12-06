package com.swati.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swati.dao.IUserDAO;
import com.swati.dao.InvalidUserException;
import com.swati.dao.UserDAO;
import com.swati.util.DAOUtility;

@WebServlet(description = "/validateServlet", urlPatterns = { "/validate" })
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ValidateServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String userName, password;
		PrintWriter out = response.getWriter();
		userName = request.getParameter("userName");
		password = request.getParameter("password");
		String userType = null;
		RequestDispatcher requestDispatcher = null;

		userType = getUserType(userName, password);
		System.out.println(userType);

		if (userType.equals("Admin")) {
			requestDispatcher = request.getRequestDispatcher("/AdminServlet");
			// requestDispatcher.forward(request, response);
		} else if (userType.equals("User")) {
			requestDispatcher = request.getRequestDispatcher("/user");
			// requestDispatcher.forward(request, response);
		} else {
			requestDispatcher = request.getRequestDispatcher("/invalid");
			// requestDispatcher.forward(request, response);
		}
		requestDispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private String getUserType(String userName,String password) {
		IUserDAO dao = DAOUtility.getUserDAO();
		return dao.getUserType(userName, password);

	}
}
