package com.servlet;

import java.io.IOException;

import com.conn.DBConnect;
import com.dao.PersonDao;
import com.entity.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/register")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String email=req.getParameter("email");
		String qualification=req.getParameter("qualification");
		String bloodgroup=req.getParameter("bloodgroup");
		String course=req.getParameter("course");
		String contactnumber=req.getParameter("contactnumber");
		
		Person person=new Person(name,dob,email,qualification,bloodgroup,course,contactnumber);
		PersonDao dao=new PersonDao(DBConnect.getconn());
		boolean f=dao.addPerson(person);
		HttpSession session=req.getSession();
		if (f) {
			session.setAttribute("succMsg", "New Person Added Successfully");
			resp.sendRedirect("addperson.jsp");
		}else {
			session.setAttribute("errorMsg", "Something went wrong");
			resp.sendRedirect("addperson.jsp");
		}
		
	}
	
	

}
