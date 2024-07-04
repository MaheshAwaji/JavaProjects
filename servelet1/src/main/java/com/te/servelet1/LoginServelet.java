package com.te.servelet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServelet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String mail=req.getParameter("mail");
		String password=req.getParameter("password");
		PrintWriter writer=resp.getWriter();
		
		int res=LoginJDBC.addStudent(id, name, mail, password);
		if (res==1) {
			writer.println("<h1>Student Added</h1>");				
		}else {
			writer.println("<h1>Student Not Added</h1>");
		}
		
		
//		if ("password".equals(password)) {
//			RequestDispatcher requestDispatcher=req.getRequestDispatcher("success.jsp");
//			requestDispatcher.forward(req, resp);
//		}else {
//			RequestDispatcher requestDispatcher=req.getRequestDispatcher("error.jsp");
//			requestDispatcher.forward(req, resp);
//		}
		
	}

}