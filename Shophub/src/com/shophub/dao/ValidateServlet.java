package com.shophub.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shophub.dao.UserDAO;
import com.swati.util.DAOUtility;

@WebServlet(description = "/validateServlet", urlPatterns = { "/validate" })
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ValidateServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
		HttpServletResponse response) throws ServletException, IOException {
/*		String userName, password;
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
*/
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		/*PrintWriter printWriter=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		//String pname=request.getParameter("pname");
	//	String image=request.getParameter("image");
		//int price=Integer.parseInt(request.getParameter("price"));
		
		UserDAO dao = new UserDAO();
		int valid= dao.showProduct(pid);
		printWriter.print("hii");
		doGet(request, response);
	}
	

	private ArrayList showproduct(long productid) {
		Iproduct dao = DAOUtility.getProduct();
		

	}*/
		PrintWriter out = response.getWriter();
		ConnectionFactory.getConnection();
		out.println(new ProductDAO().getData());
	}
}
