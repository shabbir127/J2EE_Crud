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
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	    String name=req.getParameter("name");
	    String dob=req.getParameter("dob");
	    String email=req.getParameter("email");
	    String qualification=req.getParameter("qualification");
	    String bloodgroup=req.getParameter("bloodgroup");
	    String course=req.getParameter("course");
	    String contactnumber=req.getParameter("contactnumber");
	    int id=Integer.parseInt(req.getParameter("id"));
	    
	    Person person=new Person(id,name,dob,email,qualification,bloodgroup,course,contactnumber);
	    System.out.println(person);
	    PersonDao personDao=new PersonDao(DBConnect.getconn());
	    HttpSession session=req.getSession();
	    boolean f=personDao.updatePerson(person);

		if (f) {
			session.setAttribute("succMsg", "Employee Details Edited successfully....");
			resp.sendRedirect("index.jsp");
			System.out.println("Employee Detail Submitted successfully");
			
			
		}else {
			session.setAttribute("errorMsg", "Something Wrong....");
			resp.sendRedirect("index.jsp");
			System.out.println("Something wronh on server");
			
		}
	
	
	
	}
	

}
