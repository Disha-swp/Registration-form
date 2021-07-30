package registration.controller;
//<!"<%=request.getContextPath() %>/register"!>
import registration.dao.*;
import registration.model.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/register")
public class employeeservelet extends HttpServlet {
	
	employeedao empdao = new employeedao();
	
	public employeeservelet()
	{
		super();
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("server at: ").append(request.getContextPath());
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/employeeRegistration.jsp");
		//RequestDispatcher rd = request.getRequestDispatcher("register");
		rd.forward(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		String addRess = request.getParameter("address");
		String conTact = request.getParameter("contact");
		
		employee emp = new employee();
		emp.setFirstname(firstName);
		emp.setLastname(lastName);
		emp.setUsername(userName);
		emp.setPassword(passWord);
		emp.setAddress(addRess);
		emp.setContact(conTact);
		
		try {
			empdao.registeremployee(emp);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/employeedetails.jsp");
		rd.forward(request,response);
	}

}
